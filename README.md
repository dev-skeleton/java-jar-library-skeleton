# TODO Change to your project name

> TODO Add your project description

> [中文文档]() (TODO remove this after done your own)

## Environment

+ Windows 10
+ Java 11
+ IDEA 2021.2

## modules

+ TODO Add your module details


## Usage (TODO delete this section after done your own)

+ pom.xml
  + Follow TODO
  + Change GAV
  + Change artifact name
  + Change contact info
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

        <!-- if private key, using this
        <server>
            <id>siteServer</id>
            <privateKey>/path/to/private/key</privateKey>
            <passphrase>optional; leave empty if not used.</passphrase>
        </server>
        -->
    </servers>
    ```

+ deploy
  + `mvn clean deploy`
