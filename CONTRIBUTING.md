# Contributing

Thanks for your interest in contributing to the mParticle Java Server Events SDK.

## Reporting issues

Bug reports and feature requests are welcome via [GitHub issues](https://github.com/mParticle/mparticle-java-events-sdk/issues).

Please **do not** open an issue or pull request for a security vulnerability — see [SECURITY.md](SECURITY.md) for the disclosure process.

## Development

### Requirements

- JDK 17 to build (CI uses Zulu 17). The library itself targets Java 8 bytecode.

### Build and test

```sh
./gradlew build   # compile and assemble
./gradlew test    # run unit tests
```

To try your changes against a local project, install the SDK to your local Maven repository. Pass a `-SNAPSHOT` version — `build.gradle` signs all publications, and signing is required for any non-SNAPSHOT version, so a bare `publishToMavenLocal` fails without mParticle's release key:

```sh
./gradlew publishToMavenLocal -PVERSION=2.8.0-SNAPSHOT
```

### Project layout

| Path | Contents |
| --- | --- |
| `src/main/java/com/mparticle/client` | `EventsApi` Retrofit interface and `HttpBasicAuth` |
| `src/main/java/com/mparticle/model` | Serializable models mirroring the Events API JSON schema |
| `src/main/java/com/mparticle` | `ApiClient`, `JSON` (Gson config), `Logger` |
| `src/test/java/com/mparticle/client` | Unit tests |

The model classes mirror the [mParticle Events API](https://docs.mparticle.com/developers/server/http/) payload schema. When adding a field to a model, follow the existing pattern in that class: a `SERIALIZED_NAME_*` constant, a `@SerializedName` annotated field, a fluent setter, a getter, and updates to `equals`, `hashCode` and `toString`.

## Pull requests

PRs target `main`. CI runs these checks on every PR:

1. **Unit tests** (`./gradlew test`) — required to merge.
2. **PR title** must follow [Conventional Commits](https://www.conventionalcommits.org/), e.g. `feat: add FireTV to PlatformEnum` or `chore(deps): bump retrofit` — required to merge.
3. **Branch name** must start with a conventional prefix — `feat/`, `fix/`, `chore/`, `docs/`, `test/`, `refactor/`, `perf/`, `style/`, `build/`, `ci/` or `revert/`.
4. **Target branch** must be `main`.

Please add or update unit tests for any behaviour change, and make sure `./gradlew test` passes locally before opening the PR.

Add a line describing your change under `## [Unreleased]` in [CHANGELOG.md](CHANGELOG.md), creating that heading if it is missing. Release automation renames that heading but does not write entries, so a change with no entry ships an empty release note.

## Releases

Releases are automated and run by maintainers — see [AGENTS.md](AGENTS.md#releases). Do not hand-edit `VERSION` or the version strings in `README.md` in a feature PR; the release workflow owns both. `CHANGELOG.md` is the exception — add your `## [Unreleased]` entry as described above.
