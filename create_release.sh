#!/bin/bash
set -x

usage() {
    cat <<EOF
Usage: ./create_release.sh [--test] <branch> <release_name>

Tags the given branch and creates (or updates) a GitHub release for it via
the gh CLI. Creating the release triggers .github/workflows/release.yml
(on: release: created), which builds/publishes the Java SDK to Maven
Central and the Python SDK to PyPI, and attaches the jar/pip assets.

Arguments:
  --test         Test mode: creates the release as a draft (--draft) and skips
                 waiting for/watching the release.yml run. Use this for local
                 testing of the tag + release creation flow. release.yml's build
                 job has an `if: github.event.release.draft == false` guard, so
                 it will still queue for a draft release but skips its steps
                 without publishing anything.
  --previous-tag <tag>
                 Generate release notes relative to this tag instead of
                 gh's auto-detected previous release (passed through as
                 gh release create's --notes-start-tag).
  branch         Source branch to release from
  release_name   Release name, e.g. 32.1.3 (tag pushed will be tag-<release_name>).
                 Include exactly one of "java-sdk" or "python-sdk"
                 in the name to publish only that target (e.g. 32.1.3-java-sdk);
                 omit all of them to publish everything, matching how
                 .github/workflows/release.yml picks its target from the tag name.

Requirements:
  - gh CLI installed and authenticated (run 'gh auth login' once)

Example:
  ./create_release.sh --previous-tag tag-32.1.2 32.1.3 32.1.3
  ./create_release.sh --test eng 32.1.3
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

if [ "$TEST_MODE" = true ]; then
    echo "Running in --test mode: release will be created as a draft, and the release.yml wait/watch step will be skipped."
fi

if ! command -v gh &>/dev/null; then
    echo "gh (GitHub CLI) not found. Install it: https://cli.github.com/ and run 'gh auth login'."
    exit 1
fi

REL=$2
BRANCH=$1
if [ $BRANCH = "eng" ]; then
    echo "Branch should not be ENG."
    exit 1
fi

if [ -z $REL ]; then
    echo "Pl. give the release name eg. release version, 32.x.x"
    usage
    exit 1
fi

REL_TAG=tag-$REL

# release.yml picks its publish target by matching these exact substrings in the tag
# name (java-sdk / python-sdk); no match means it publishes everything.
# Validate the release name so a typo doesn't silently fall through to an "all" release.
SDK_KEYWORDS=(java-sdk python-sdk)
MATCHED_KEYWORDS=()
for kw in "${SDK_KEYWORDS[@]}"; do
    if [[ "$REL_TAG" == *"$kw"* ]]; then
        MATCHED_KEYWORDS+=("$kw")
    fi
done

if [ "${#MATCHED_KEYWORDS[@]}" -gt 1 ]; then
    echo "Error: release name '$REL' matches multiple SDK-specific keywords (${MATCHED_KEYWORDS[*]}). release.yml can only target one. Use only one of: ${SDK_KEYWORDS[*]}."
    exit 1
fi

if [ "${#MATCHED_KEYWORDS[@]}" -eq 0 ] && echo "$REL_TAG" | grep -qiE '(java|python)[-_]?sdk'; then
    echo "Error: release name '$REL' looks like it references an SDK release but doesn't exactly match the keyword release.yml checks for. Use one of: ${SDK_KEYWORDS[*]}."
    exit 1
fi

if [ "${#MATCHED_KEYWORDS[@]}" -eq 1 ]; then
    echo "Release type detected: ${MATCHED_KEYWORDS[0]}"
else
    echo "Release type: all (java-sdk + python-sdk)"
fi

if git rev-parse -q --verify "refs/tags/$REL_TAG" >/dev/null || git ls-remote --exit-code --tags origin "$REL_TAG" >/dev/null 2>&1; then
    echo "Tag $REL_TAG already exists. Aborting to avoid overwriting an existing release tag."
    exit 1
fi
git tag $REL_TAG
git push origin $REL_TAG
set -e
git checkout -B $BRANCH

# Creating the GitHub release is what triggers .github/workflows/release.yml
# (on: release: created), which builds/publishes the Java SDK to Maven Central and the
# Python SDK to PyPI, and attaches the jar/pip assets automatically.
RELEASE_CREATED_AT=$(date -u +%Y-%m-%dT%H:%M:%SZ)
echo "Creating release $REL_TAG."
CREATE_ARGS=("$REL_TAG" --title "$REL_TAG" --generate-notes)
if [ -n "$PREVIOUS_TAG" ]; then
    CREATE_ARGS+=(--notes-start-tag "$PREVIOUS_TAG")
fi
if [ "$TEST_MODE" = true ]; then
    CREATE_ARGS+=(--draft)
fi
gh release create "${CREATE_ARGS[@]}"

if [ "$TEST_MODE" = true ]; then
    echo "Test mode: skipping release.yml wait/watch. Verify the draft with: gh release view $REL_TAG"
    exit 0
fi

# Find the workflow run that this release triggered, then wait for it to finish
# and fail this script if it fails.
echo "Waiting for the release.yml workflow run to start..."
RUN_ID=""
for i in $(seq 1 30); do
    RUN_ID=$(gh run list --workflow=release.yml --json databaseId,event,createdAt \
        --jq "[.[] | select(.event == \"release\" and .createdAt >= \"$RELEASE_CREATED_AT\")] | sort_by(.createdAt) | last | .databaseId // empty")
    if [ -n "$RUN_ID" ]; then
        break
    fi
    sleep 5
done

if [ -z "$RUN_ID" ]; then
    echo "Error: could not find the release.yml run triggered by $REL_TAG. Check manually: gh run list --workflow=release.yml"
    exit 1
fi

echo "Watching release.yml run $RUN_ID..."
if gh run watch "$RUN_ID" --exit-status; then
    echo "release.yml succeeded for $REL_TAG."
else
    echo "Error: release.yml failed for $REL_TAG. See: gh run view $RUN_ID --log-failed"
    exit 1
fi
