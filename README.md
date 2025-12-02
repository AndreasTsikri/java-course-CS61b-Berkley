## Solution to HW and projects on CS61B Berkley (online) course on JAVA!

> HW3 -> Lists, Sets, Maps 


"skeleton-fa" folder is cloned from Berkley's github folder on "https://github.com/Berkeley-CS61B/skeleton-fa25"

In order to run the JUnit test package as jar through command line use :
- 1. Remove all com.google dependencies from tests. We will use only JUnit lib!

- 2. Download the junit standalone (junit-platform-console-standalone:6.1.0-M1 ) **as jar file** using the maven. 
```bash
mvn dependency:get \
  -Dartifact=org.junit.platform:junit-platform-console-standalone:6.1.0-M1 \
  -Ddest= .
```
This is downloading the jar at the present folder but i will just move it through linux to execute each test case when i need it!:

- 3. Compile the "src" and "test" java classes from .java -> .class :
```bash
javac -cp junit-platform-console-standalone-6.1.0-M1.jar src/main/java/*.java test/ArrayExercisesTest.java
```

- 3. Run the java command to execute the tests on "test" folder:
```bash
java -jar junit-platform-console-standalone-6.1.0-M1.jar execute --class-path test --scan-class-path
```
where "test" is the folder with .java tests
