
# Java Play Ground

## Introduction
This repository is my side project where I document and share Java examples and concepts.

## Environment Setup
Java typically uses build tools and Integrated Development Environments (IDEs) to manage projects and dependencies.

### Recommended Tools
1. **Java Development Kit (JDK)**
   - Download and install the latest JDK from the [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://openjdk.java.net/).
   - Alternatively, use SDKMAN to manage JDK versions:
     ```sh
     curl -s "https://get.sdkman.io" | bash
     source "$HOME/.sdkman/bin/sdkman-init.sh"
     sdk install java 11.0.11.j9-adpt
     ```

2. **Integrated Development Environment (IDE)**
   - **VS Code**: Lightweight and versatile, with Java extensions available. Download it [here](https://code.visualstudio.com/).

3. **Build Tools**
   - **Gradle**: A build automation tool used to manage project dependencies. Use the Gradle Wrapper included in the project.

### Setting Up the Project
1. **Clone the Repository**
   ```sh
   git clone https://github.com/jeff52415/java-play-ground.git
   cd java-play-ground
   ```

2. **Using the Gradle Wrapper**
   - The Gradle Wrapper is included in the repository. You can build the project without having to install Gradle manually:
     ```sh
     ./gradlew build
     ```
   - If the Gradle Wrapper is not included, you will need to generate it by running the following command:
      ```sh
     gradle wrapper --gradle-version 8.7
     ```

3. **Build the Project**
   ```sh
   ./gradlew build
   ```

4. **Run the Application**
   - You can run the main class specified in `build.gradle` using:
     ```sh
     ./gradlew run
     ```

5. **Run Tests**
   - If you add tests in the future, you can run them using:
     ```sh
     ./gradlew test
     ```

### Common Dependencies Included

- **JUnit**: For writing and running unit tests.
- **Apache Commons Lang**: Provides helper utilities for the java.lang API.
- **Gson**: For parsing JSON data.

You can add more dependencies as needed by updating the `build.gradle` file.

## Suggested Learning Path
To make the most of this repository, follow the learning path below. Start with the basics and progress through more advanced topics.

1. **Basics**
   - Start here to understand fundamental Java concepts and syntax.
   - Path: `fundamentals`

2. **Loops**
   - Learn about different looping constructs in Java.
   - Path: `loops`

3. **Access Control**
   - Understand access modifiers and how they control visibility.
   - Path: `accesscontrol`

4. **Static vs Non-Static**
   - Learn the differences between static and non-static members.
   - Path: `staticvsnonstatic`

5. **Inheritance**
   - Study how inheritance works in Java.
   - Path: `inheritance`

6. **Collections**
   - Dive into Java collections framework.
   - Path: `collections`

7. **Exceptions**
   - Learn how to handle exceptions in Java.
   - Path: `exceptions`

8. **File I/O**
   - Understand how to read from and write to files.
   - Path: `fileio`

9. **Generics**
   - Learn about generics for type-safe programming.
   - Path: `generics`

10. **Concurrency**
    - Explore multithreading and concurrency in Java.
    - Path: `concurrency`

11. **Networking**
    - Understand the basics of network programming.
    - Path: `networking`

12. **Junit**
    - Learn how to write unit tests with JUnit.
    - Path: `junit`

13. **Lambda and Streams**
    - Study lambda expressions and stream API for functional programming.
    - Path: `lambda`, `streams`

14. **Annotations**
    - Understand annotations and how to use them.
    - Path: `annotations`

## Conclusion
This repository is a work in progress, and I will continue to add more examples and topics over time. Feel free to explore the code, make suggestions, and contribute if you find it helpful. Happy learning!

## Contact
- **Author**: Jeff Yang
- **Email**: jeff52415@gmail.com
