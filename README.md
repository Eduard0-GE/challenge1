# Compass Uol Challenge 1
### In this first challenge, I was tasked with completing 5 projects using the technologies that I learned during the first month. The projects are: a Java program that gets the student with the least amount of tasks completed, a program that checks the emotion of a text based on the amount and type of emoticons in it, a calculator program that returns the result of an operation in String format, creating SQL tables, and in the last project, creating a NoSQL document 

### Q-01 Sorting students:
The objective of this project is to create a program that will sort students by the least amount of tasks completed. In case of a tie, students with the same grade will be sorted alphabetically. The student at the top of the descending list will lose the contest. In this program, I created a StudentTest class that has the methods to achieve this objective. During the program, I will create instances of students, put them in an ArrayList, use their values to create a HashMap with the amount of tasks as the key and a list of names as the values, loop through the HashMap, and get the student after sorting the list.

### Q-02 Checking emotions:
The objective of this project is to create a program that will determine an emotion based on the number of emoticons in an input text. The program will loop through the text and count the number of instances of the emoticons ':-)' and ':-('. After the calculation, the program will print the emotion based on the calculated value.

### Q-03: Calculating strings
The objective of this project is to create a program that will calculate the result of a string operation. The program will first ask for the number of operands in the equation. After obtaining the operand count, the program will ask for the operation in string format. Then, the operands and operators will be separated into different lists. Finally, the program will use these values to print the calculation result."


### Q-04: Creating SQL tables
The objective of this project is to create a SQL table script. For this task, I have created two SQL scripts: one for the 'address' table and another for the 'person' table. The 'address' table needs to be created first, as its primary key is used in the 'person' table. After creating the 'address' table, the 'person' table is then created using the 'address_id' as a foreign key.


### Q-05: Creating noSql Document
The objective of this project is to create a MongoDB person document script. For this project, I created a JSON file with attributes that were asked for in the challenge. Inside the document, I added the address object with additional attributes. Later, I created a .js script to run the commands needed to create the document in the MongoDB shell.
