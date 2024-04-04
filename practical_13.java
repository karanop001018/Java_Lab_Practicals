//Q. Write a program that prompts the user to enter a decimal number
//        and displays the number in a fraction.
//        Hint: Read the decimal number as a string, extract the integer part
//        and fractional part from the string

package Lab_Practicals;
import java.util.*;
public class practical_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        String decimalNumber = scanner.nextLine();

        String[] parts = decimalNumber.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "0";

        String fraction = integerPart + " " + fractionalPart + "/10^" + fractionalPart.length();
        System.out.println("The fraction representation is: " + fraction);
    }
}
