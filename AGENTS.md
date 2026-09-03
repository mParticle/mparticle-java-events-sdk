# mParticle Java Server Events SDK - Agent Instructions

Loaded into every agent session, so it holds only what you cannot get by reading the repository.
Anything a config file already states is deliberately absent: read the config, which cannot go
stale, rather than this file, which can. For the rest see `README.md` (install and public API),
`CONTRIBUTING.md` (build, test and PR conventions) and the
[Events API docs](https://docs.mparticle.com/developers/server/http/).

## Working rules

A Java client for mParticle's **server-side** Events API, published to Maven Central. Treat it as a
public library, not an application: keep the public API additive and deprecate rather than remove.
Do not raise the bytecode floor - `sourceCompatibility`/`targetCompatibility` are pinned in
`build.gradle`, and the JDK CI builds with is pinned in each workflow; read those rather than
assuming. Logging goes through `com.mparticle.Logger`, which is a no-op until the consumer installs
a `LogHandler` - never add `System.out` or `printStackTrace`. Never log or embed API keys, secrets
or user PII, including in tests and fixtures.

This is not the Android SDK. Anything for mobile clients belongs in `mparticle-android-sdk`.

## Names that collide

Three different names refer to this one project, and the build uses all three:

- `mparticle-java-events-sdk` is the repository.
- `server-events-sdk` is the Gradle root project (`settings.gradle`) and the Maven artifact id.
- `com.mparticle` is the group id *and* the Java package - the same package the Android SDK uses,
  so a search for `com.mparticle` across a machine will surface both.

## Commands

- Build: `./gradlew build`
- Unit tests: `./gradlew test`
- Install locally: `./gradlew publishToMavenLocal -PVERSION=<next>-SNAPSHOT`

### Command traps

1. **`publishToMavenLocal` fails without a `-SNAPSHOT` version.** `build.gradle` calls
   `signAllPublications()`, which makes signing *required* for any version not ending in
   `-SNAPSHOT`, and the Sign task then aborts with no signatory. `-PVERSION` overrides the `VERSION`
   file for exactly this reason. CI works around it the other way, injecting
   `ORG_GRADLE_PROJECT_signingInMemoryKey` into its non-SNAPSHOT smoke test.
2. **`README.md` documents the command that does not work** - its "Local Maven" section still shows
   a bare `./gradlew publishToMavenLocal`. Use the form above.

## Conventions that no config enforces

- **The models are not generated, despite looking generated.** They carry `io.swagger` annotations
  and were originally derived from a Swagger definition, but there is no generator config and no
  `@Generated` marker anywhere. Edit them directly.
- **`@SerializedName` is the wire format, and a wrong one fails silently.** It must match the Events
  API schema exactly; a mismatch is dropped server-side rather than erroring. Adding a field means
  matching the shape already in that class: a `SERIALIZED_NAME_*` constant, the annotated field, a
  fluent setter, a getter and setter, and entries in `equals`, `hashCode` and `toString`.
- **Never hand-edit `VERSION` or the README version strings.** The Release - Draft workflow rewrites
  both in one pass; a new place a version lives has to be taught to that workflow or it goes stale.
- **`CHANGELOG.md` is the opposite: it must be hand-written.** Release automation only *renames* the
  `## [Unreleased]` heading and never authors entries, so a change with no entry ships an empty
  release note. Add yours under `## [Unreleased]`, creating that heading if it is absent. (Note this
  is the reverse of `mparticle-apple-sdk`, where the changelog is generated from PR titles - do not
  carry that habit across.)

## Pull requests

- Base off `main`. Branch name and PR title are both checked against the semantic-commit convention;
  the allowed prefixes are listed in `CONTRIBUTING.md`.
- **CI is mostly not the merge gate.** Only `Unit Tests` and `Check PR for semantic title` are
  required status checks. The branch-name and target-branch checks run and can go red without
  blocking anything.
- **Nothing requires a review.** The `main` protection has no required-review rule and does not
  enforce for admins, so a PR can merge unreviewed. CODEOWNERS (`* @mParticle/sdk-team`) requests a
  reviewer but does not gate the merge.
- `main` requires signed commits and linear history, and **squash is the only enabled merge method**
  - so GitHub authors and signs the commit that actually lands, and an unsigned commit on the PR
  branch does not block the merge.
- **`release/<version>` branches fail the branch-name check by design.** Release - Draft opens its
  PR from that prefix, which is not in the allow-list. It is red on every release PR and is not a
  gate; ignore it there.

## Gotchas

1. **Release - Draft is currently broken on `main`.** The 2.7.0 release consumed the
   `## [Unreleased]` heading and nothing restored it, so the first `h2` is a version heading. The
   pinned `keep-a-changelog-new-release` action requires that heading to be a lone link reference
   and throws `Invalid changelog format` otherwise. Restoring the heading fixes it.
2. **Generated changelog compare URLs are wrong.** Release - Draft passes the bare `VERSION` as the
   tag while releases are tagged `v<version>`, so the links it writes point at a tag that does not
   exist. Pre-existing; do not "fix" a single link by hand.
3. **A Dependabot `labels:` entry naming a label the repo does not have is silently dropped** *and*
   suppresses the default labels, leaving its PRs unlabelled. Create the label first or omit the
   key. Dependabot is otherwise exempt from the branch-name and title checks, which skip
   `dependabot[bot]` outright.
