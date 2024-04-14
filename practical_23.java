//Q. Write a program that defines a Circle class with two constructors.
//        The first form accepts a double value that represents the radius of
//        the circle. The second form accepts the integer radius of the circle
//        and calculates the area of the circle.

package Lab_Practicals;
import  java.util.*;
public class practical_23 {

    public static void main(String[] args) {
        // Create a Circle object with double radius
        Circle circle1 = new Circle(5.0);
        System.out.println("Area of circle with double radius: " + circle1.calculateArea());

        // Create a Circle object with integer radius
        Circle circle2 = new Circle(7);
        System.out.println("Area of circle with integer radius: " + circle2.calculateArea());
    }
    public static class Circle {
        private double radius;

        // Constructor with double value (radius as double)
        public Circle(double radius) {
            this.radius = radius;
        }

        // Constructor with integer value (radius as int)
        public Circle(int radius) {
            this.radius = radius;
        }

        // Method to calculate and return the area
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

}
