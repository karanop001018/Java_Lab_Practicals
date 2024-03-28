/*
Q. Write an interactive program to print a string entered in a pyramid.
        For instance, the string “stream” has to be displayed as follows:
         S
        S t
       S t r
      S t r e
     S t r e a
    S t r e a m
*/

package Lab_Practicals;
import java.util.*;
public class practical_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        printPyramid(str);
    }

    public static void printPyramid(String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(str.charAt(k) + " ");
            }
            System.out.println();
        }
    }
}