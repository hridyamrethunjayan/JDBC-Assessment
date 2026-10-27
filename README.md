JDBC Student Database Management:
A Java application using JDBC and MySQL to insert student records into a database in one operation

Technologies Used

- Java
- JDBC
- MySQL
- Maven
- IntelliJ IDEA

Prerequisites

Before running this project, install:

- JDK
- IntelliJ IDEA
- MySQL Server and MySQL Workbench
- Maven support in IntelliJ IDEA

1. Clone the Repository

git clone https://github.com/hridyamrethunjayan/JDBC-Assessment.git
cd JDBC-Assessment

Open the cloned project in IntelliJ IDEA.

2. Create the Database

Open MySQL Workbench and execute the SQL script in 'database/database.sql'.
The database and table are:

CREATE DATABASE student;
USE student;

CREATE TABLE IF NOT EXISTS StudentDetails (
    StudentID INT PRIMARY KEY,
    StudentName VARCHAR(30),
    Course VARCHAR(30),
    Department VARCHAR(30),
    Section VARCHAR(5)
);

3. Configure Maven

Open 'pom.xml' and ensure the MySQL Connector/J dependency is included.
In IntelliJ IDEA, open the Maven tool window and select Reload All Maven Projects to download the required dependency.

4. Configure Database 
   
In IntelliJ IDEA:
1. Open Run → Edit Configurations.
2. Select the run configuration for 'InsertStudent'.
3. Add these environment variables:
   
DB_USER=your_mysql_username
DB_PASSWORD=your_mysql_password

Replace the sample values with your own MySQL credentials. 

5. Run the Program
Run 'InsertStudent.java' from IntelliJ IDEA.

6. Verify the Inserted Records
Run the following query in MySQL Workbench:
USE student;
SELECT * FROM StudentDetails;
It should display all inserted student records.

Errors and how to resolve:

- Access denied: Check your 'DB_USER' and 'DB_PASSWORD' environment variables.
- Unknown database: Execute the SQL script to create the 'student' database

Author:

Hridya K P
RA2511047010165
