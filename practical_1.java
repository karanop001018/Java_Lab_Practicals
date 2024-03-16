/*
Q. Use Cramer's rule to solve the following 2 X 2 system of linear
        equations for x and y:
        ax + by = e x = (ed - bf)/(ad - bc)
        cx + dy = f y = (af - ec)/(ad -bc)
        Write a Java program that prompts the user to enter the constants a,
        b, c, d, e, and f and the display the solution (x =?? and y =??). If
        ad-bc is 0, then your program prints “The equation has no
        solution".
        Note: (1) 3.4x+50.2y=44.5 (2) 2.1x+.55y=5.9
*/

package Lab_Practicals;
import java.util.*;
public class practical_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the constants a, b, c, d, e, and f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double denominator = a * d - b * c;

        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;
            System.out.println("x = " + x + " and y = " + y);
        }
    }
}
