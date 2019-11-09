### Learning Quarkus..

#### Gradle  quarkus quide.
https://quarkus.io/guides/gradle-tooling#import-in-your-ide

#### Cheat Sheet:

1  run the app in dev mode
```bash
./gradlew quarkusDev

```
2 build a uber jar to test.

```bash
./gradlew quarkusBuild --uber-jar
```

3  build a native docker image

```bash
./gradlew buildNative --docker-build=true
```

4 listing the quarkus extensions

```bash
./gradlew listExtensions
```

5 quarkus adding extensions
```bash
./gradlew addExtension --extensions="hibernate*"
```