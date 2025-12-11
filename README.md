# Advance_JAVA_Tasks
## Task-1
# 1. Loading the Oracle Driver
The program first loads a special driver file.
This driver acts like a translator between Java and Oracle. 
Without it, Java cannot speak to the database.

# 2. Setting Up the Database Details
The program stores:
Database location (URL)
Username
Password
These details are required for connecting to your local Oracle database.

# 3. Making a Connection
The program tries to connect to the Oracle database using the information you provided. If the database is running and the details are correct, the connection is created successfully.

# 4. Sending a Request to the Database
The program sends a simple request to Oracle asking:
“Is there any data inside the 'users' table?”
Oracle receives the request and checks the table.

# 5. Receiving the Reply
Oracle sends a response back:
If the table contains at least one row → "Yes, data exists"
If the table is empty → "No data found"

# 6. Displaying the Result to You
Based on the reply:
If data exists → the program prints Connection Successful
If the table is empty → it prints Connection Failed
This doesn’t mean the connection failed — it only means the table is empty, but the connection still worked.

# 7. Closing the Connection
The program finally closes the connection to avoid memory leaks. This is a good programming practice.

# Requirements to Run This Program
You must have:
Java JDK installed
Oracle Database installed (XE or any edition)
Oracle JDBC driver (usually ojdbc17.jar or ojdbc17.jar)
The table users created in your Oracle database
# How to Add ojdbc17.jar to Your Project
 If You Are Using IDE (Eclipse / IntelliJ / NetBeans):
Download ojdbc17.jar from Oracle.
First, copy/paste the jar file into your project's lib folder.
Open IntelliJ → Go to File > Project Structure.
Select Modules from the left panel.
Click the Dependencies tab.
Click the + (Add) button.
Choose JARs or Directories.
Select the ojdbc17.jar file from your lib folder.
Apply → OK.
Now the jar file is successfully added to your project. (Eclipse / IntelliJ / NetBeans):**
Download ojdbc17.jar from Oracle official site.
Right-click your project.
Select Build Path or Project Structure.
Click Add External JARs / Add Library.
Select ojdbc17.jar.
Apply and save.
# If You Are Running From Command Line:
Place ojdbc17.jar in your project folder.
Compile the file like this:
javac -cp .;ojdbc17.jar DB_Connection.java
Run the program like this:
java -cp .;ojdbc17.jar DB_Connection
Now the program can connect to Oracle successfully.

# How to Run the Program
Add the Oracle JDBC driver to your project’s classpath
Compile the file using any Java compiler
Run the program
View the output in the console
Possible Outputs
You will see one of these messages:
Connection Successful
This means:
Oracle is running
Java successfully connected
The users table has data
Connection Failed
This means:
The table is empty
OR your query found no rows
Connection still worked — only data was missing.
