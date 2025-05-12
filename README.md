# bookstore-tests


# Book Store Automation Framework

This project is a BDD automation framework developed in Java using Cucumber, Selenium WebDriver, and Maven. It automates the testing of the mini Book Store website: [https://demoqa.com/books](https://demoqa.com/books). I have added on three tests in two feature files stored at  **src/test/resources/features
**

##  Features
Below are are some features in brief for teh framework
- **Behavior-Driven Development (BDD)** with Cucumber
- **Page Object Model (POM)** design pattern
- **Detailed Reporting** using Extent Reports
- **Cross-Browser Testing** capabilities

##  What is missing?
  
  Adeqaute data management : used Scenario outlines to provide data however the framework can improve to use data source like json files or csv files.


##  Technologies Used

- Java 8+
- Maven
- Cucumber
- Selenium WebDriver
- JUnit
- Extent Reports

##  Project Structure

     Since I am employing Page object model so
     1. Package names pages under src/main/java/com/demoqa/bookstore has all the code related to business logic that is the 
     locator and methods for each page in its respecive classes .

     2. utils package under src/main/java/com/demoqa/bookstore cinatisn utilities like Webdriver manager that creates and 
        returns drivers based on the browser the automation needs to be run on.
        
     3. folder src/test/java/resource contains all the feature files
     
     4. folder src/test/java/runners has the Testrunner file 

     5. folder src/test/java/resources/ has all the feature files and  required extent reporting support files.


##  How to execute
     1. clone the repository using intellij IDE using creating project from VCS https://github.com/Rahulchinki/bookstore- 
        tests.git
     2. open IDE (intellij preferred)
     3. Let maven download and install required project dependencies.
     4. user mvn clean test  or mvn clean test -Dbrowser=chrome  or mvn clean test -Dbrowser=edge

