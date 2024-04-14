//Q. Write a program of constructor overloading and make zero
//        argument constructor to set a default values of student name, roll
//        no and total marks. And make another constructor with all the three
//        parameters and make use of ‘this’ keyword. Using methods,
//        display values of both the constructors.

package Lab_Practicals;
import java.util.*;
public class practical_22 {

    public static void main(String[] args) {
        // Create a Student object using default constructor
        Student defaultStudent = new Student();
        System.out.println("Default Constructor values:");
        defaultStudent.displayDetails();

        // Create a Student object using parameterized constructor
        Student customStudent = new Student("Alice", 101, 85.5);
        System.out.println("\nParameterized Constructor values:");
        customStudent.displayDetails();
    }
    public static class Student {
        private String name;
        private int rollNo;
        private double totalMarks;

        // Zero-argument constructor (default constructor)
        public Student() {
            // Set default values
            this.name = "Unknown";
            this.rollNo = 0;
            this.totalMarks = 0.0;
        }

        // Constructor with three parameters
        public Student(String name, int rollNo, double totalMarks) {
            // Use 'this' to refer to instance variables
            this.name = name;
            this.rollNo = rollNo;
            this.totalMarks = totalMarks;
        }

        // Method to display student details
        public void displayDetails() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Total Marks: " + totalMarks);
        }
    }

}
