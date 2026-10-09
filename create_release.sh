#!/bin/bash
set -x

usage() {
    cat <<EOF
Usage: ./create_release.sh [--test] [--previous-tag <tag>] <branch> <release_name>

Releases the Java SDK (Maven Central) and/or the Python SDK (PyPI) through the
GitHub Actions workflows:
  .github/workflows/release-java.yml
  .github/workflows/release-python.yml

Real run: tags origin/<branch> as tag-<release_name>, pushes the tag, creates the
GitHub release (which triggers the workflow(s), on: release: created) and watches
the triggered run(s), failing this script if any run fails.

Arguments:
  --test         Dry run. Nothing is published and no tag, draft or GitHub release
                 is created. Triggers the workflow(s) in dry-run mode on <branch>,
                 waits for them and downloads the final bundles to
                 ./dry-run-<release_name>/ for pre-release validation.
  --previous-tag <tag>
                 Generate release notes relative to this tag instead of
                 gh's auto-detected previous release (passed through as
                 gh release create's --notes-start-tag).
  branch         Source branch to release from. The branch must contain the
                 release-java.yml / release-python.yml workflow files.
  release_name   Release name, e.g. 32.1.3 (tag pushed will be tag-<release_name>).
                 Include exactly one of "java-sdk" or "python-sdk" in the name to
                 release only that SDK (e.g. 32.1.3-java-sdk); omit both to
                 release Java and Python together.

Requirements:
  - gh CLI installed and authenticated (run 'gh auth login' once)

Example:
  ./create_release.sh --test 32.1.3 32.1.3-java-sdk
  ./create_release.sh --previous-tag tag-32.1.2 32.1.3 32.1.3
EOF
}

TEST_MODE=false
PREVIOUS_TAG=""
ARGS=()
while [ $# -gt 0 ]; do
    case "$1" in
        --test)
            TEST_MODE=true
            shift
            ;;
        --previous-tag)
            if [ $# -lt 2 ]; then
                echo "Error: --previous-tag requires a value."
                usage
                exit 1
            fi
            PREVIOUS_TAG="$2"
            shift 2
            ;;
        *)
            ARGS+=("$1")
            shift
            ;;
    esac
done
set -- "${ARGS[@]}"

if [ "$1" = "-h" ] || [ "$1" = "--help" ]; then
    usage
    exit 0
fi

if [ $# -ne 2 ]; then
    usage
    exit 1
fi

if ! command -v gh &>/dev/null; then
    echo "gh (GitHub CLI) not found. Install it: https://cli.github.com/ and run 'gh auth login'."
    exit 1
fi

REL=$2
BRANCH=$1

# A real release must never come from the eng branch; a dry run is harmless.
if [ "$BRANCH" = "eng" ] && [ "$TEST_MODE" != true ]; then
    echo "Branch should not be ENG."
    exit 1
fi

if [ -z "$REL" ]; then
    echo "Pl. give the release name eg. release version, 32.x.x"
    usage
    exit 1
fi

REL_TAG=tag-$REL

# The workflows pick which SDK to publish by matching these exact substrings in the
# tag name; no match means both SDKs. Validate the release name so a typo doesn't
# silently fall through to a "both" release.
SDK_KEYWORDS=(java-sdk python-sdk)
MATCHED_KEYWORDS=()
for kw in "${SDK_KEYWORDS[@]}"; do
    if [[ "$REL_TAG" == *"$kw"* ]]; then
        MATCHED_KEYWORDS+=("$kw")
    fi
done

if [ "${#MATCHED_KEYWORDS[@]}" -gt 1 ]; then
    echo "Error: release name '$REL' matches multiple SDK-specific keywords (${MATCHED_KEYWORDS[*]}). Use only one of: ${SDK_KEYWORDS[*]}, or neither to release both SDKs."
    exit 1
fi

if [ "${#MATCHED_KEYWORDS[@]}" -eq 0 ] && echo "$REL_TAG" | grep -qiE '(java|python)[-_]?sdk'; then
    echo "Error: release name '$REL' looks like it references an SDK release but doesn't exactly match the keywords the workflows check for. Use one of: ${SDK_KEYWORDS[*]}."
    exit 1
fi

# Same routing as the workflows: java-sdk -> Java only, python-sdk -> Python only, else both.
WORKFLOWS=()
if [ "${#MATCHED_KEYWORDS[@]}" -eq 1 ]; then
    echo "Release type detected: ${MATCHED_KEYWORDS[0]}"
    if [ "${MATCHED_KEYWORDS[0]}" = "java-sdk" ]; then
        WORKFLOWS=(release-java.yml)
    else
        WORKFLOWS=(release-python.yml)
    fi
else
    echo "Release type: both (java-sdk + python-sdk)"
    WORKFLOWS=(release-java.yml release-python.yml)
fi
echo "Workflows: ${WORKFLOWS[*]}"

if ! gh auth status &>/dev/null; then
    echo "gh is not authenticated. Run 'gh auth login'."
    exit 1
fi

set -e

# Always work from the remote state of the branch, never from whatever is checked out.
git fetch origin "$BRANCH"

# The workflow file used is the one on the branch (dry run) / on the tagged commit (real run).
for wf in "${WORKFLOWS[@]}"; do
    if ! git cat-file -e "origin/$BRANCH:.github/workflows/$wf" 2>/dev/null; then
        echo "Error: .github/workflows/$wf does not exist on origin/$BRANCH."
        exit 1
    fi
done

# Waits for the newest run of workflow $1 (event $3) created at/after $2 and watches it.
# Sets LAST_RUN_ID; returns non-zero if the run was not found or failed.
watch_run() {
    local wf="$1" since="$2" event="$3" run_id=""
    echo "Waiting for the $wf workflow run to start..."
    for i in $(seq 1 30); do
        run_id=$(gh run list --workflow="$wf" --event="$event" --limit 10 --json databaseId,createdAt \
            --jq "[.[] | select(.createdAt >= \"$since\")] | sort_by(.createdAt) | last | .databaseId // empty")
        if [ -n "$run_id" ]; then
            break
        fi
        sleep 5
    done
    if [ -z "$run_id" ]; then
        echo "Error: could not find the $wf run. Check manually: gh run list --workflow=$wf"
        return 1
    fi
    LAST_RUN_ID="$run_id"
    echo "Watching $wf run $run_id..."
    if gh run watch "$run_id" --exit-status; then
        echo "$wf succeeded."
    else
        echo "Error: $wf failed. See: gh run view $run_id --log-failed"
        return 1
    fi
}

# ---- Dry run: nothing is tagged, released or published ----
if [ "$TEST_MODE" = true ]; then
    OUT_DIR="dry-run-$REL"
    mkdir -p "$OUT_DIR"
    echo "Running in --test mode: dry run of ${WORKFLOWS[*]} on $BRANCH. No tag or GitHub release is created."
    STARTED_AT=$(date -u +%Y-%m-%dT%H:%M:%SZ)
    for wf in "${WORKFLOWS[@]}"; do
        gh workflow run "$wf" --ref "$BRANCH" -f version="$REL" -f ref="$BRANCH" -f dry_run=true
    done
    FAILED=0
    for wf in "${WORKFLOWS[@]}"; do
        if watch_run "$wf" "$STARTED_AT" workflow_dispatch; then
            gh run download "$LAST_RUN_ID" --dir "$OUT_DIR"
        else
            FAILED=1
        fi
    done
    if [ "$FAILED" -ne 0 ]; then
        echo "Dry run FAILED."
        exit 1
    fi
    echo "Dry run OK. Bundles for validation are in $OUT_DIR/ (nothing was published)."
    exit 0
fi

# ---- Real release ----
if git rev-parse -q --verify "refs/tags/$REL_TAG" >/dev/null || git ls-remote --exit-code --tags origin "$REL_TAG" >/dev/null 2>&1; then
    echo "Tag $REL_TAG already exists. Aborting to avoid overwriting an existing release tag."
    exit 1
fi

# Tag the remote tip of the branch (not the current checkout).
git tag "$REL_TAG" "origin/$BRANCH"
git push origin "$REL_TAG"

# Creating the GitHub release is what triggers the workflow(s) (on: release: created).
# They build, publish to Maven Central / PyPI and attach the assets automatically.
RELEASE_CREATED_AT=$(date -u +%Y-%m-%dT%H:%M:%SZ)
echo "Creating release $REL_TAG."
CREATE_ARGS=("$REL_TAG" --title "$REL_TAG" --generate-notes --verify-tag)
if [ -n "$PREVIOUS_TAG" ]; then
    CREATE_ARGS+=(--notes-start-tag "$PREVIOUS_TAG")
fi
gh release create "${CREATE_ARGS[@]}"

# Wait for every triggered run; fail this script if any of them fails.
FAILED=0
for wf in "${WORKFLOWS[@]}"; do
    watch_run "$wf" "$RELEASE_CREATED_AT" release || FAILED=1
done
if [ "$FAILED" -ne 0 ]; then
    echo "Error: one or more release workflows failed for $REL_TAG. Re-run only the failed run(s) from the Actions tab; do not re-run this script."
    exit 1
fi
echo "Release $REL_TAG completed."
