//Q. Write a program using interface inheritance. Make two interfaces
//        one is Shape2D which contains a method to calculate the area of
//        the circle and the second interface Shape3D which contains method
//        to calculate the volume of the sphere. Both the classes, Circle and
//        Sphere extends one abstract class Shape which contains a method
//        display( ) to display the area and volume.

package Lab_Practicals;
public class practical_28 {
        public static void main(String[] args) {
            Circle circle = new Circle(5.0);
            Sphere sphere = new Sphere(3.0);

            System.out.println("Area of Circle: " + circle.calculateArea());
            System.out.println("Volume of Sphere: " + sphere.calculateVolume());
        }
    }
    // Interface for 2D shapes
    interface Shape2D {
        double calculateArea();
    }

    // Interface for 3D shapes
    interface Shape3D {
        double calculateVolume();
    }

    // Abstract class Shape
    abstract class Shape {
        abstract void display();
    }

    // Circle class implementing Shape2D
    class Circle implements Shape2D {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Sphere class implementing Shape3D
    class Sphere implements Shape3D {
        private double radius;

        public Sphere(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateVolume() {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
    }
