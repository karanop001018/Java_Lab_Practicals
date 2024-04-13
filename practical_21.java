//Q. Write an application that declares a class named Person. It should
//        have instance variables to record name, age & salary. Use the new
//        operator to create a Person object. Set & display its instance
//        variables.

package Lab_Practicals;
import java.util.*;
public class practical_21 {

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", 30, 50000.0);

        // Display instance variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: $" + person.getSalary());
    }
    static class Person {
        private String name;
        private int age;
        private double salary;

        // Constructor to initialize instance variables
        public Person(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

    }
}