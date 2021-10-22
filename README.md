[![CircleCI](https://circleci.com/gh/mohitsaxenaknoldus/mavenassignment/tree/main.svg?style=svg)](https://circleci.com/gh/mohitsaxenaknoldus/mavenassignment/tree/main)

Maven Assignment Group 1

Modules:

- assign
  - cal-api
  - cal-impl
  
Plugins:

- checkstyle
- spotbugs
- maven assembly
- maven compiler
- maven dependency

How to run:

- Clone the repo.
- Inside group1 folder, run this: mvn clean compile assembly:single
- Inside cal-impl folder, run this to execute the jar: java -cp target/<jar_file_name> Application
