#!/bin/sh
# Writes a release version into every file that carries it. Run from the repository root:
#
#   scripts/bump-version.sh <version> [patch|minor|major]
#
# The release tooling runs it, then updates CHANGELOG.md and opens the release pull request. The bump type is
# accepted for a common interface and not needed here. Works with GNU and BSD sed.
set -eu

usage() {
  echo "usage: $0 <version> [patch|minor|major], where <version> is like 1.2.3" >&2
  exit 2
}

VERSION="${1:-}"
# Anything but digits and dots (a newline included) is refused before any file is touched.
case "$VERSION" in
  "" | *[!0-9.]*) usage ;;
esac
printf '%s' "$VERSION" | grep -Eq '^[0-9]+\.[0-9]+\.[0-9]+$' || usage

# sed -i differs between GNU and BSD sed, so each file is rewritten through a temporary copy, removed if sed fails.
replace() {
  file="$1"
  shift
  tmp="$file.bump.$$"
  if ! sed "$@" "$file" > "$tmp"; then
    rm -f "$tmp"
    exit 1
  fi
  mv "$tmp" "$file"
}

replace README.md \
  -e "s/implementation 'com.mparticle:server-events-sdk:[^']*'/implementation 'com.mparticle:server-events-sdk:${VERSION}'/g" \
  -e "s|<version>.*</version>|<version>${VERSION}</version>|g"
# VERSION last: it is the file that starts a release, so it changes only once everything else has.
printf '%s\n' "$VERSION" > VERSION
