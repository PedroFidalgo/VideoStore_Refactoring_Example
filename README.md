This is an example of basic refactoring steps to achive a higher cohesion supported by tests. The example is inspired by Martin Fowler's  book: Refactoring.
The refactoring steps coincide with each commit.

Requirements:
 - Maven 3.5
 - JDK 1.8  
 or  
 - Docker 17.0+ (Run 'docker build -t videostore_refactoring .' on the project root folder.)  
The docker registry hub has a Maven image that can be used to create java containers.  
Using this approach the build machine does not need to have either Java or Maven pre-installed, Docker controls the entire build process.  

To execute the tests, on the project root folder, run:  
'mvn clean compile test'  
Or if you have Docker:  
'docker run videostore_refactoring mvn clean compile test'


To execute the App.java, on the project root folder, run:  
'mvn clean compile exec:java'  
Or if you have Docker:  
'docker run videostore_refactoring mvn clean compile exec:java'
