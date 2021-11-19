# Pre-requisites
* Java 1.8
* Maven

# How to run the code

We have provided scripts to execute the code. 

Use `run.sh` if you are Linux/Unix/macOS Operating systems and `run.bat` if you are on Windows.

Internally both the scripts run the following commands 

 * `mvn clean install -DskipTests assembly:single -q` - This will create a jar file `geektrust.jar` in the `target` folder.
 * `java -jar target\2dSquare.jar` - This will execute the jar file passing in the sample input file as the command line argument

 # How to execute the unit tests

 `mvn clean test` will execute the unit test cases.
 