
# Gradle Setup and Usage Guide

## Introduction
This guide provides step-by-step instructions for setting up and using Gradle in your Java project. It includes details on initializing the Gradle Wrapper, managing dependencies, and using the Wrapper to build and run your project.

## Installing Gradle (if not installed)
Before you can use the Gradle Wrapper, you need to have Gradle installed to generate the Wrapper files. You can download Gradle from the [Gradle website](https://gradle.org/install/).

## Initializing the Gradle Wrapper
Run the following command in your project directory to initialize the Gradle Wrapper:
```sh
gradle wrapper --gradle-version 8.7
```
This command creates the following files and directories:
```
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
```

## Ensuring `gradlew` Script Has Execute Permissions
On Unix-based systems, make sure the `gradlew` script has execute permissions:
```sh
chmod +x gradlew
```

## Adding Gradle Wrapper Files to Version Control
Commit these files to your version control system (e.g., Git). This ensures that anyone cloning your repository can use the same version of Gradle without installing it manually.

```sh
git add gradlew gradlew.bat gradle/wrapper/gradle-wrapper.jar gradle/wrapper/gradle-wrapper.properties
git commit -m "Add Gradle Wrapper files"
git push origin main
```

## Building the Project Using the Gradle Wrapper
Now, you can build your project using the Gradle Wrapper. The Wrapper ensures that the specified version of Gradle (in this case, 8.7) is used for the build.
```sh
./gradlew build
```

## Understanding What Happens

### What Does `gradle wrapper --gradle-version 8.7` Do?
- **Creates Wrapper Files**: The command generates the `gradlew`, `gradlew.bat`, and `gradle/wrapper` directory containing `gradle-wrapper.jar` and `gradle-wrapper.properties`.
- **Specifies Gradle Version**: The `gradle-wrapper.properties` file specifies the version of Gradle to be used. For example:
  ```
  distributionUrl=https\://services.gradle.org/distributions/gradle-8.7-bin.zip
  ```

### Where Are Dependencies Installed?
- **Dependencies Directory**: Gradle caches and manages dependencies in the `~/.gradle` directory (on Unix-based systems) or `C:\Users\YourUsername\.gradle` (on Windows).
- **Project Build Directory**: Each project also has a `build` directory where compiled classes, resources, and other build artifacts are placed.

## Dependency Management
Gradle uses a build script (e.g., `build.gradle`) to manage dependencies. Here's how dependencies are specified and resolved:

### Specify Dependencies in `build.gradle`
```groovy
dependencies {
    // JUnit for unit testing
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.1'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.1'
    
    // Apache Commons Lang for utility functions
    implementation 'org.apache.commons:commons-lang3:3.12.0'

    // Gson for JSON parsing
    implementation 'com.google.code.gson:gson:2.8.6'
}
```

### Resolve and Download Dependencies
When you run a Gradle task (e.g., `./gradlew build`), Gradle resolves and downloads the specified dependencies from repositories like Maven Central. The dependencies are downloaded and cached in the `.gradle` directory in your home directory.

## How to Use the Gradle Wrapper

1. **Clone the Repository**
   ```sh
   git clone https://github.com/jeff52415/java-play-ground.git
   cd java-play-ground
   ```

2. **Build the Project**
   - Use the Gradle Wrapper to build the project, ensuring the specified version of Gradle is used.
   ```sh
   ./gradlew build
   ```

3. **Run the Application**
   ```sh
   ./gradlew run
   ```

4. **Run Tests**
   ```sh
   ./gradlew test
   ```

## Choosing Gradle Version
- **Version Choice**: You can choose any stable version of Gradle. The choice of version (e.g., 8.7) depends on compatibility with your project and any specific features or fixes you need.
- **Updating Version**: If a new version of Gradle is released, you can update the `gradle-wrapper.properties` file to use the new version and regenerate the Wrapper files if needed.

## Summary
- The Gradle Wrapper ensures a consistent build environment by using a specified version of Gradle.
- Dependencies are specified in `build.gradle` and managed by Gradle, avoiding the need for virtual environments like in Python.
- The `gradlew` and `gradlew.bat` scripts, along with the `gradle/wrapper` directory, should be committed to your repository to ensure all contributors can build the project without installing Gradle manually.

By following these steps, you can set up and manage your Java project with Gradle effectively.
