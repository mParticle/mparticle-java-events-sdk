#!/usr/bin/env bash
: ${1?"Version missing - usage: $0 x.y.z"}

#update build.gradle
sed -i '.bak' "s/version = '.*'/version = '$1'/g" build.gradle

#update README.md
sed -i '.bak' "s/'com.mparticle:server-events-sdk:.*'/'com.mparticle:server-events-sdk:$1'/g" README.md
sed -i '.bak' "s/<version>.*</<version>$1</g" README.md

#commit the version bump, tag, and push to private and public
git add build.gradle
git add README.md