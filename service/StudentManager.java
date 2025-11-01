package service;

import java.util.*;
import model.*;

public class StudentManager implements RecordActions {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void addStudent() {
        int rollno;
        System.out.println("Enter rollno:");
        rollno = scan.nextInt();
        scan.nextLine();
        for (Student X : students) {
            if (X.rollno == rollno) {
                System.out.println("Rollno already exits");
                return;
            }
        }

        String name;
        System.out.println("Enter student name:");
        name = scan.nextLine();

        String email;
        System.out.println("Enter student's email'");
        email = scan.nextLine();

        String course;
        System.out.println("Enter course:");
        course = scan.nextLine();

        double marks;
        System.out.println("Enter total marks");
        marks = scan.nextDouble();

        Student S = new Student(rollno, name, email, course, marks);
        students.add(S);

        System.out.println("Data added successfully");
    }

    public void deleteStudent() {
        int rn;
        System.out.println("Enter Roll No:");
        rn = scan.nextInt();
        scan.nextLine();

        for (Student S : students) {
            if (S.rollno == rn) {
                students.remove(S);
                System.out.println("Data deleted successfully");
                break;
            } else {
                System.out.println("Invalid Roll No");
            }
        }
    }

    public void updateStudent() {
        int rn;
        System.out.println("Enter Roll No:");
        rn = scan.nextInt();
        scan.nextLine();

        for (Student S : students) {
            if (S.rollno == rn) {
                System.out.println("Enter updated name");
                S.name = scan.nextLine();

                System.out.println("Enter updated email");
                S.email = scan.nextLine();

                System.out.println("Enter updated course");
                S.course = scan.nextLine();

                System.out.println("Enter updated marks");
                S.marks = scan.nextDouble();
                scan.nextLine();

                System.out.println("Data updated successfully");
            } else {
                System.out.println("Invalid Roll No");
            }
        }
    }

    public void searchStudent() {
        int rn;
        System.out.println("Enter Roll No:");
        rn = scan.nextInt();
        scan.nextLine();

        for (Student S : students) {
            if (S.rollno == rn) {
                S.displayInfo();
            } else {
                System.out.println("Invalid Roll No");
            }
        }
    }

    public void viewAllStudents() {
        for (Student S : students) {
            S.displayInfo();
        }
    }

    public void displayChoice() {
        System.out.println("1.Create student");
        System.out.println("2.View student");
        System.out.println("3.Update student details");
        System.out.println("4.Delete student details");
        System.out.println("5.View all students");
        System.out.println("6.Exit");
    }
}
