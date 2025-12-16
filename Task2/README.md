# JDBC SELECT Operation – Student Table

## Overview

This Java program demonstrates how to retrieve and display data from an **Oracle database** using **JDBC**. It executes a `SELECT` query on the `student` table and prints all records to the console.

---

## Project Structure

* **Package:** `Task2`
* **Class:** `Select_query`
* **Database:** Oracle XE
* **Operation:** SELECT

---

## Prerequisites

Before running this program, ensure the following:

1. **Oracle Database (XE)** is installed and running
2. **student** table exists in the database
3. **Oracle JDBC Driver (ojdbc)** is added to the project classpath
4. Correct **username** and **password** are used

---

## Student Table Structure

The program expects the following table structure:

* `id` (NUMBER)
* `name` (VARCHAR2)
* `age` (NUMBER)
* `email` (VARCHAR2)
* `mobile` (VARCHAR2)

---

## What the Program Does

1. Loads the Oracle JDBC driver
2. Establishes a connection with the Oracle database
3. Executes the SQL query:

   ```sql
   SELECT * FROM student;
   ```
4. Retrieves each row from the result set
5. Prints student details in the console
6. Closes all JDBC resources properly

---

## Output Format

Each row is printed in the following format:

```
id | name | age | email | mobile
```

Example:

```
1 | Siddhi Phase | 21 | siddhi@gmail.com | 9876543210
```

---

## How to Run

1. Compile the Java file
2. Run the `Select_query` class
3. View the output in the console

---

## Error Handling

* `ClassNotFoundException` – if JDBC driver is not found
* `SQLException` – if any database error occurs

Both exceptions are handled using `try-catch` blocks.

---

## Notes

* The program uses `PreparedStatement` for executing the query
* All database resources (`ResultSet`, `PreparedStatement`, `Connection`) are closed after use

---
