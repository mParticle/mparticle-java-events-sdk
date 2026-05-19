# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [2.8.0] - Unreleased

### Fixed

- `ApiClient` no longer leaks OkHttp's default `User-Agent` header (`okhttp/<version>`) on outbound requests. Requests now omit the `User-Agent` header entirely unless explicitly set by the caller. This resolves cases where mParticle was enriching `device_info.http_header_user_agent` with a meaningless library-identifier string. Caller-supplied values (set via a custom OkHttp interceptor) are preserved. See PR notes for version bump guidance.

## [2.7.0] - 2026-03-17

### Added

- Add FireTV to PlatformEnum (#23)

## [2.6.0] - 2024-10-24

### Added

- Add getter and setter method for partner identities (#20)

### Fixed

- Pin conventional commits (#21)

## [2.5.4] - 2023-10-15

### Fixed

- Update retrofit (#19)

## [2.5.3] - 2023-01-04

### Fixed

- 429 handling response header (#18)

## [2.5.2] - 2022-11-21

### Fixed

- Add in Logger.debug support (#17)

## [2.5.1] - 2022-11-16

### Fixed

- Remove System.out.println statements (#16)

## [2.5.0] - 2022-11-08

### Added

- Added CCPA consent support (#14)

## [2.4.1] - 2022-10-11

### Fixed

- Fixed ConsentState class for purpose names (#11)

## [2.4.0] - 2022-07-18

### Added

- Add 429 handling logic (#9)

## [2.3.3] - 2022-01-05

### Fixed

- Don't remove attributes when value is set to null

[2.8.0]: https://github.com/mParticle/mparticle-java-events-sdk/compare/v2.7.0...v2.8.0
[2.7.0]: https://github.com/mParticle/mparticle-java-events-sdk/compare/v2.6.0...v2.7.0
[2.6.0]: https://github.com/mParticle/mparticle-java-events-sdk/compare/v2.5.4...v2.6.0
[2.5.4]: https://github.com/mParticle/mparticle-java-events-sdk/compare/v2.5.3...v2.5.4
[2.5.3]: https://github.com/mParticle/mparticle-java-events-sdk/compare/v2.5.2...v2.5.3
[2.5.2]: https://github.com/mParticle/mparticle-java-events-sdk/compare/v2.5.1...v2.5.2
[2.5.1]: https://github.com/mParticle/mparticle-java-events-sdk/compare/v2.5.0...v2.5.1
[2.5.0]: https://github.com/mParticle/mparticle-java-events-sdk/compare/v2.4.1...v2.5.0
[2.4.1]: https://github.com/mParticle/mparticle-java-events-sdk/compare/v2.4.0...v2.4.1
[2.4.0]: https://github.com/mParticle/mparticle-java-events-sdk/compare/v2.3.3...v2.4.0
[2.3.3]: https://github.com/mParticle/mparticle-java-events-sdk/releases/tag/v2.3.3
