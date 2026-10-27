JDBC Student Database Management

A Java application using JDBC and MySQL to insert student records into a database using `PreparedStatement` and batch processing.

Technologies Used

- Java 25
- JDBC
- MySQL
- Maven
- IntelliJ IDEA

Project Structure


JDBCAssessment/
├── database/
│   └── database.sql
├── src/
│   └── InsertStudent.java
├── pom.xml
└── README.md


Prerequisites

Before running this project, install:

- JDK 25
- IntelliJ IDEA
- MySQL Server and MySQL Workbench
- Maven support in IntelliJ IDEA

1. Clone the Repository


git clone https://github.com/hridyamrethunjayan/JDBC-Assessment.git
cd JDBC-Assessment


Open the cloned project in IntelliJ IDEA.

2. Create the Database

Open MySQL Workbench and execute the SQL script in `database/database.sql`.

The database and table are:

CREATE DATABASE IF NOT EXISTS student;
USE student;

CREATE TABLE IF NOT EXISTS StudentDetails (
    StudentID INT PRIMARY KEY,
    StudentName VARCHAR(30),
    Course VARCHAR(30),
    Department VARCHAR(30),
    Section VARCHAR(5)
);

If the SQL script already contains these statements, execute the script instead of creating the table again.

3. Configure Maven

Open `pom.xml` and ensure the MySQL Connector/J dependency is included.

In IntelliJ IDEA, open the Maven tool window and select **Reload All Maven Projects** to download the required dependency.

4. Configure Database Credentials

The program reads the MySQL credentials from environment variables instead of storing the password in the source code.

In IntelliJ IDEA:

1. Open **Run → Edit Configurations**.
2. Select the run configuration for `InsertStudent`.
3. Add these environment variables:


DB_USER=your_mysql_username
DB_PASSWORD=your_mysql_password


Replace the example values with your own MySQL credentials. Do not commit your actual password to GitHub.

If the source file is not recognized automatically after cloning, mark the `src` directory as **Sources Root** in IntelliJ IDEA.

5. Run the Program

Run `InsertStudent.java` from IntelliJ IDEA.

Follow the console prompts to enter the student records. Ensure the number of records entered matches the program's prompts.

6. Verify the Inserted Records

Run the following query in MySQL Workbench:


USE student;
SELECT * FROM StudentDetails;

The inserted records should appear in the query results.

Troubleshooting

- **Access denied:** Check your `DB_USER` and `DB_PASSWORD` environment variables.
- **Unknown database:** Execute the SQL script to create the `student` database.
- **No suitable driver / driver not found:** Reload Maven and confirm MySQL Connector/J is present in `pom.xml`.
- **Source file not recognized:** Mark `src` as Sources Root in IntelliJ IDEA.
- **Duplicate primary key:** Use a `StudentID` that does not already exist in the table.

Author

Hridya K P
RA2511047010165
GitHub: [hridyamrethunjayan](https://github.com/hridyamrethunjayan)
