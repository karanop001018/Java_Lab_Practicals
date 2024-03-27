//Q. Write a program to find that given number or string is palindrome or not.

package Lab_Practicals;
import java.util.*;
public class practical_9 {
    public static void main(String[] args) {
        String str = "Madam";
        str = str.toLowerCase();

        boolean isPalindrome = true;
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}
