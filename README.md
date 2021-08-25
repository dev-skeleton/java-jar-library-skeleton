# TODO Change to your project name

> TODO Add your project description

> [中文文档](./README_CN.md) (TODO remove this and README_CN.md after done your own)

## Environment

+ Windows 10
+ Java 8
+ IDEA 2021.2

## modules

+ TODO Add your module details

## Usage (TODO delete this section after done your own)

+ pom.xml
  + Follow TODO
  + Change GAV
  + Change artifact name
  + Change contact info
  + (Optional) Change jdk version if needed
  + Change distribution
+ src/main/java
  + Change package with name of `com.example.artifact` to your own
  + Change module with name of `modulename` to your own
  + (Optional) Add your own module and lib
  + Follow `com.example.artifact.modulename.ExampleUtil` to implement your own lib
+ src/test/java
  + Change package with name of `com.example.artifact` to your own
  + Change module with name of `modulename` to your own
  + Follow `com.example.artifact.modulename.ExampleUtilTest` to implement your own lib unit test
+ set your local maven deploy configure
  + (Optional if already have) Have maven repo like nexus or jfrog server installed, and got the username and password for deploy
  + (Optional if already installed) Have maven installed
  + (Optional if already set) Add or change your settings.xml in $HOME/.m2/, add section below <settings>
    + servers xml config
      ```xml
      <servers>
          <server>
              <id>repo-releases</id>
              <username>username</username>
              <password>password</password>
          </server>
          <server>
              <id>repo-snapshots</id>
              <username>username</username>
              <password>password</password>
          </server>
      
          <!-- if using private key, follow this
          <server>
              <id>siteServer</id>
              <privateKey>/path/to/private/key</privateKey>
              <passphrase>optional; leave empty if not used.</passphrase>
          </server>
          -->
      </servers>
      ```
    + NOTICE: above `server.id` like repo-releases must equal to pom.xml distributionManagement -> `repository.id`

  + Full example of $HOME/.m2/settings.xml
        
    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">

      <!-- TODO change me -->
      <localRepository>\path\to\your\home\.m2\repository</localRepository>

      <interactiveMode>true</interactiveMode>

      <offline>false</offline>
      
      <!-- TODO change your own id and authorities -->
      <servers>
        <server>
          <id>repo-releases</id>
          <username>username</username>
          <password>password</password>
        </server>
        <server>
          <id>repo-snapshots</id>
          <username>username</username>
          <password>password</password>
        </server>
      </servers>

      <!-- TODO change your own maven repo addr -->
      <mirrors>
        <mirror>
          <id>private-mirror</id>
          <mirrorOf>central</mirrorOf>
          <name>Example Private Maven Repo</name>
          <url>https://mvn.example.com/content/groups/public/</url>
        </mirror>
      </mirrors>

    </settings>
    ```

+ deploy
  + `mvn clean deploy`

## Git commit format

- `feat` Add new features
- `fix` bugfix
- `style` code style, no logic change
- `perf` performance/optimize
- `refactor` refactor
- `revert` revert commit
- `test` test
- `docs` document
- `chore` dependencies or skeleton changes
- `workflow` workflow improvement
- `ci` continue integration
- `types` type define
- `wip` work in progress
