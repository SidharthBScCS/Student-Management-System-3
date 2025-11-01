# Student Management System

## Problem Statement
Enhance the Student Management System by implementing exception handling and multithreading to ensure safe execution and responsiveness. The system should handle invalid input (such as marks outside the valid range or
empty fields) using try-catch-finally blocks and custom exceptions like
StudentNotFoundException. Additionally, the system should simulate a loading
process when adding or saving student data by using multithreading. The
program should utilize wrapper classes (such as Integer, Double) for data
conversion and autoboxing where applicable, providing a robust and responsive
user interface for managing student records.


## Attributes
- **name** -> String, name of the student
- **email** -> String, email adress of the student
- **course** -> String, course of the student
- **rollNo** -> Integer, roll number of the student
- **marks** -> Marks obtained by the student
- **grade** -> Grade calculated based on marks


## System Components

### Package : 'model'

#### Person.java
- Abstract class with fields: 'name' , 'email'
- Constructor to initialize fields
- Abstract method: displayInfo()

#### Student.java
- Extends 'Person'
- Additional fields: 'rollNo' , 'course' , 'marks' , 'grade'
- Method: 'calcGrade()' calculates grade based on marks
- Method: 'displayInfo()' overrides abstract method
- Method: 'displayInfo(String msg) overloaded

#### StudentNotFoundException.java
- Custom exception class for handling missing student records


### Package: 'service'

#### RecordActions.java
- Interface defining:
     addStudent()
     deleteStudent()
     updateStudent()
     searchStudent()
     viewAllStudent()

#### StudentManager.java
- Implements 'RecordActions'
- Uses 'ArrayList<Student>' to store records
- Prevents duplicate roll numbers
- Implements all CRUD methods with validation and exception handling

### Main Class: 'StudentManagementSystemMain.java'
- Menu-driven program
- Uses 'Scanner' for input
- Calls methods from 'StudentManager'
- Handles exceptions gracefully


## Code Explanation
This project uses several core Java concepts to make the Student Management System more efficient. Exception handling
is used to catch and manage runtime errors like invalid input so that program doesn't crash and can guide the user with helpful.
messages.

A custom exception **StudentNotFoundException** is created to handle specific cases when a student record is not found,
showing how we can define our own error types. **MultiThreading** is implemented using the **Thread** and **Runnable** interfaces to simulate
a loading animation when adding a student, which improves the user experience bu mimicking the real-time process.

**Wrapper Classes** like **Integer** and **Double** are used to instead of primitive types to take advantage of features like 
autoboxing and to allow object-based comparisons.

The use of **Inheritance** allows the **Student** class to reuse common fields from the abstract **Person** class, while **method overloading** and **method overriding** demonstrates 
polymorphism by polymorphism by customizing how student information is displayed. Together, these
concepts make the system modular, error-fre, and easy to extend.


## Concepts Covered
- Inheritance
- Abstract Method
- Method Overriding
- Method Overloading
- Interfaces
- Encapsulation
- Polymorphism
- Exception Handlind
- try&catch method
- Wrapper classes
- Data validation


## Sample Outcome
<img width="888" height="697" alt="Screenshot (59)" src="https://github.com/user-attachments/assets/49dc6a18-2388-497d-be84-500238ee5018" />
<img width="986" height="734" alt="Screenshot (60)" src="https://github.com/user-attachments/assets/b782dfc1-e286-42c3-af4c-e30a96faf319" />

## Student Details
- **Name** -> Sidharth Krishna S
- **RollNo** -> 2401720003
- **Course** -> BSc Computer Science
- **Semester** -> 3rd Semester
- **Assignment** -> Java Lab Assignment 3
