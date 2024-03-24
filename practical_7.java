//Q. Write a program to find length of string and print second half of the string.

package Lab_Practicals;
import java.util.*;
public class practical_7 {
    public static void main(String[] args) {
                String str = "Hello, World!";
                int length = str.length();
                String secondHalf = str.substring(length / 2);

                System.out.println("Length of the string: " + length);
                System.out.println("Second half of the string: " + secondHalf);
    }
}
