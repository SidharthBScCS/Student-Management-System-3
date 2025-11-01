package model;

public class Student extends Person {
    public int rollno;
    public String name;
    public String email;
    public String course;
    public double marks;
    public char grade;

    public Student(int rollno, String name, String email, String course, double marks) {
        super(name, email);
        this.rollno = rollno;
        this.course = course;
        this.marks = marks;
        this.name = name;
        this.email = email;
        this.grade = calcGrade();
    }

    private char calcGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 80)
            return 'B';
        else if (marks >= 70)
            return 'C';
        else if (marks >= 60)
            return 'D';
        else if (marks >= 50)
            return 'E';
        else
            return 'F';
    }

    @Override
    public void displayInfo() {
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Course: " + this.course);
        System.out.println("Marks: " + this.marks);
        System.out.println("Grade: " + this.grade);
    }

    public void displayInfo(boolean showSummary) {
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Name: " + this.name);
        if (!showSummary) {
            System.out.println("Email: " + this.email);
            System.out.println("Course: " + this.course);
            System.out.println("Grade: " + this.grade);
        }
    }
}