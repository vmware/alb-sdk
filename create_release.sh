#!/bin/bash
# Creates an SDK release, or dry-runs one.
#
# Release name decides what is published (see .github/workflows/release-*.yml):
#   32.1.4-java-sdk     -> Java SDK only (Maven Central)
#   32.1.4-python-sdk   -> Python SDK only (PyPI)
#   32.1.4              -> Java and Python SDKs
#
# Real run : tags <branch> as tag-<release_name>, pushes the tag, creates the GitHub
#            release (which triggers the workflows) and watches the runs.
# --test   : no tag, no release, nothing published. Triggers the workflows in dry-run
#            mode on <branch>, waits, and downloads the final bundles to
#            ./dry-run-<release_name>/ for pre-release validation.

set -euo pipefail

usage() {
    cat <<EOF
Usage: ./create_release.sh [--test] [--previous-tag <tag>] <branch> <release_name>

  --test                 Dry run: build and download bundles, publish nothing.
  --previous-tag <tag>   Generate release notes relative to <tag>
                         (gh release create --notes-start-tag).
  <branch>               Branch to release from, e.g. 32.1.4
  <release_name>         e.g. 32.1.4, 32.1.4-java-sdk, 32.1.4-python-sdk

Examples:
  ./create_release.sh --test 32.1.4 32.1.4-java-sdk
  ./create_release.sh --previous-tag tag-32.1.3 32.1.4 32.1.4-python-sdk
  ./create_release.sh 32.1.4 32.1.4
EOF
}

TEST=false
PREV_TAG=""
POSITIONAL=()
while [ $# -gt 0 ]; do
    case "$1" in
        --test) TEST=true; shift ;;
        --previous-tag)
            [ $# -ge 2 ] || { echo "--previous-tag needs a value"; exit 1; }
            PREV_TAG="$2"; shift 2 ;;
        -h|--help) usage; exit 0 ;;
        -*) echo "Unknown option: $1"; usage; exit 1 ;;
        *) POSITIONAL+=("$1"); shift ;;
    esac
done
[ ${#POSITIONAL[@]} -eq 2 ] || { usage; exit 1; }
BRANCH="${POSITIONAL[0]}"
REL="${POSITIONAL[1]}"
REL_TAG="tag-$REL"
# Version part of the release name, e.g. 32.1.4-java-sdk -> 32.1.4
VERSION=$(echo "$REL" | sed -E 's/^(tag|test)-//' | cut -d - -f 1)

command -v gh >/dev/null || { echo "gh (GitHub CLI) is required"; exit 1; }
gh auth status >/dev/null 2>&1 || { echo "Run 'gh auth login' first"; exit 1; }

# Same routing as the workflows: an SDK name selects that SDK, otherwise both.
WORKFLOWS=()
if [[ "$REL" == *java-sdk* ]] || [[ "$REL" != *python-sdk* ]]; then
    WORKFLOWS+=(release-java.yml)
fi
if [[ "$REL" == *python-sdk* ]] || [[ "$REL" != *java-sdk* ]]; then
    WORKFLOWS+=(release-python.yml)
fi
echo "Release: $REL (version $VERSION), branch: $BRANCH, workflows: ${WORKFLOWS[*]}"

# Waits for the newest run of $1 created after $2 (ISO time) and watches it.
# Echoes nothing; exits non-zero if the run failed.
watch_run() {
    local wf="$1" since="$2" event="$3" id=""
    for _ in $(seq 1 30); do
        id=$(gh run list --workflow "$wf" --event "$event" --limit 5 \
                --json databaseId,createdAt \
                --jq "[.[] | select(.createdAt >= \"$since\")] | sort_by(.createdAt) | last | .databaseId // empty")
        [ -n "$id" ] && break
        sleep 5
    done
    [ -n "$id" ] || { echo "No run of $wf found"; return 1; }
    echo "Watching $wf run $id"
    gh run watch "$id" --exit-status
    LAST_RUN_ID="$id"
}

if $TEST; then
    OUT="dry-run-$REL"
    mkdir -p "$OUT"
    START=$(date -u +%Y-%m-%dT%H:%M:%SZ)
    for wf in "${WORKFLOWS[@]}"; do
        gh workflow run "$wf" --ref "$BRANCH" \
            -f version="$REL" -f ref="$BRANCH" -f dry_run=true
    done
    for wf in "${WORKFLOWS[@]}"; do
        watch_run "$wf" "$START" workflow_dispatch
        gh run download "$LAST_RUN_ID" --dir "$OUT"
    done
    echo "Dry run OK. Bundles for validation are in $OUT/"
    exit 0
fi

# ---- Real release ----
git fetch origin "$BRANCH" --tags
if git rev-parse -q --verify "refs/tags/$REL_TAG" >/dev/null; then
    echo "Tag $REL_TAG already exists locally. Delete it (and any release) first if this is a re-release."
    exit 1
fi
if git ls-remote --exit-code --tags origin "$REL_TAG" >/dev/null 2>&1; then
    echo "Tag $REL_TAG already exists on origin. Aborting."
    exit 1
fi

git tag "$REL_TAG" "origin/$BRANCH"
git push origin "$REL_TAG"

NOTES_ARGS=(--generate-notes)
[ -n "$PREV_TAG" ] && NOTES_ARGS+=(--notes-start-tag "$PREV_TAG")

START=$(date -u +%Y-%m-%dT%H:%M:%SZ)
gh release create "$REL_TAG" --title "$REL" "${NOTES_ARGS[@]}"

FAILED=0
for wf in "${WORKFLOWS[@]}"; do
    watch_run "$wf" "$START" release || FAILED=1
done
[ $FAILED -eq 0 ] || { echo "One or more release workflows failed"; exit 1; }

# avinetworks/avitools release handling
rm -rf avitools
git clone https://github.com/avinetworks/avitools
(
    cd avitools
    git remote set-url origin git@github.com:avinetworks/avitools.git
    git tag -f "$REL"
    git push -f origin "$REL"
)
rm -rf avitools
echo "Release $REL_TAG done"
