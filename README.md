# amazon-mws-recommendations-maven
Mavenized version of Amazon MWS Recommendations API

[![Hits-of-Code](https://hitsofcode.com/github/chameleontartu/amazon-mws-recommendations-maven)](https://hitsofcode.com/view/github/chameleontartu/amazon-mws-recommendations-maven)
[![Travis CI](https://travis-ci.org/ChameleonTartu/amazon-mws-recommendations-maven.svg?branch=master)](https://travis-ci.org/ChameleonTartu/amazon-mws-recommendations-maven)
![Maven Central](https://img.shields.io/maven-central/v/com.github.chameleontartu/amazon-mws-recommendations-maven)
[![](https://jitpack.io/v/ChameleonTartu/amazon-mws-recommendations-maven.svg)](https://jitpack.io/#ChameleonTartu/amazon-mws-recommendations-maven)



# How to use into Maven (pom.xml)


## Maven Central

The library is published into Maven Central repository

```
<dependency>
  <groupId>com.github.chameleontartu</groupId>
  <artifactId>amazon-mws-recommendations-maven</artifactId>
  <version>1.2.0</version>
</dependency>
```

## Jitpack

If you don't want to use Maven Central you can use `jitpack.io` which is mirror of Maven Central.

You would need to add additional repository to fetch it from.

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Dependency itself:
```
<dependency>
    <groupId>com.github.chameleontartu</groupId>
    <artifactId>amazon-mws-recommendations-maven</artifactId>
    <version>1.2.0</version>
</dependency>
```


# Inspiration

This project inspired by [ext-lib-amazon-mws-products](https://github.com/trifonnt/ext-lib-amazon-mws-products)

# Contribution

To contribute to this project feel free to submit issues and PRs. This section is under development, so feel free to submit issues with additional questions.

# Docs and other MWS projects

The other MWS projects that ported from Ant to Maven. See [docs](https://github.com/ChameleonTartu/amazon-mws-docs).

# Java library version

| Lib version  |
|--------------|
| 2014-10-01   |

# TODO

This repo is one of the series of MWS API SDKs which I am planning to put under the same umbrella and keep them up-to-date.
