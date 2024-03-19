//Q. Write a program that reads a number in meters, converts it to feet,and displays the result.


package Lab_Practicals;
import java.util.*;
public class practical_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length in meters : ");
        float meters = sc.nextFloat();
        double result = (meters * 3.28084);
        System.out.println("Length in feet : " + result);
    }
}
