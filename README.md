# shiro-qrcode

Apache Shiro QR code authentication extensions

## Overview

This repository provides the Apache Shiro **qrcode** extension component, split into two modules:

- `shiro-qrcode-core` — framework-neutral tokens, realms, exceptions, utility classes
  (independent of Spring Boot).
- `shiro-qrcode-spring` — Spring web filters, handlers, repositories and configuration
  glue built on top of the core module.

It is designed to be consumed directly by any application that uses Apache Shiro,
without depending on the Spring Boot auto-configuration mechanism.

## Build

```bash
./mvnw clean install
```

## Maven Coordinates

```xml
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-qrcode-core</artifactId>
    <version>3.0.x.20260630-SNAPSHOT</version>
</dependency>
```

## License

Apache License 2.0
