<img alt="logo" src="https://eo-cqrs.github.io/.github/eo-cqrs.svg" height="100px" />

[![Managed By Self XDSD](https://self-xdsd.com/b/mbself.svg)](https://self-xdsd.com/p/eo-cqrs/eo-rs?provider=github)

[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![DevOps By Rultor.com](https://www.rultor.com/b/eo-cars/eo-rs)](https://www.rultor.com/p/eo-cqrs/eo-rs)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)
<br>

[![maven](https://github.com/eo-cqrs/eo-rs/actions/workflows/mvn.yaml/badge.svg)](https://github.com/eo-cqrs/eo-rs/actions/workflows/mvn.yaml)
[![maven central](http://maven-badges.herokuapp.com/maven-central/io.github.eo-cqrs/eo-rs/badge.svg)](https://search.maven.org/artifact/io.github.eo-cqrs/eo-rs)
[![codecov](https://codecov.io/gh/eo-cqrs/eo-rs/branch/master/graph/badge.svg?token=rR4PGNZkPm)](https://codecov.io/gh/eo-cqrs/eo-rs)

[![Hits-of-Code](https://hitsofcode.com/github/eo-cqrs/eo-rs)](https://hitsofcode.com/view/github/eo-cqrs/eo-rs)
[![Lines-of-Code](https://tokei.rs/b1/github/eo-cqrs/eo-rs)](https://github.com/eo-cqrs/eo-rs)
[![PDD status](http://www.0pdd.com/svg?name=eo-cqrs/eo-rs)](http://www.0pdd.com/p?name=eo-cqrs/eo-rs)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/eo-cqrs/eo-rs/blob/master/LICENSE.txt)

Project architect: [@h1alexbel](https://github.com/h1alexbel)

REST Responses in the EO fashion.

**Motivation**. We are not happy creating classes like `UserDto` or `ErrorDto` each time we need work with REST responses.
We're suggesting classes wrappers out of the box in clear, maintainable way.

**Principles**. These are the [design principles](https://www.elegantobjects.org/#principles) behind eo-rs.

**How to use**. All you need is this (get the latest version [here](https://search.maven.org/artifact/io.github.eo-cqrs/eo-rs)):

Maven:
```xml
<dependency>
  <groupId>io.github.eo-cqrs</groupId>
  <artifactId>eo-rs</artifactId>
</dependency>
```

Gradle:
```groovy
dependencies {
    compile 'io.github.eo-cqrs:eo-rs:<version>'
}
```

## Usage
TBD

## Example
TBD

## How to Contribute

Fork repository, make changes, send us a [pull request](https://www.yegor256.com/2014/04/15/github-guidelines.html).
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
$ mvn clean install
```

You will need Maven 3.8.7+ and Java 17+.

Our [rultor image](https://github.com/eo-cqrs/eo-kafka-rultor-image) for CI/CD.
