/*
Q.      Body Mass Index (BMI) is a measure of health on weight. It can be
        calculated by taking your weight in kilograms and dividing by the
        square of your height in meters. Write a program that prompts the
        user to enter a weight in pounds and height in inches and displays
        the BMI.
        Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters
*/

package Lab_Practicals;
import java.util.Scanner;

public class practical_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double weightInPounds = input.nextDouble();

        System.out.println("Enter height in inches:");
        double heightInInches = input.nextDouble();

        // Convert weight from pounds to kilograms
        double weightInKilograms = weightInPounds * 0.45359237;

        // Convert height from inches to meters
        double heightInMeters = heightInInches * 0.0254;

        // Calculate BMI
        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.println("BMI is " + bmi);
    }
}
