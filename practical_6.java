//Q. Write a program that prompts the user to enter a letter and check
//        whether a letter is a vowel or consonant.

package Lab_Practicals;
import java.util.*;
public class practical_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single letter: ");
        char letter = scanner.next().charAt(0);

        if (Character.isLetter(letter)) {
            switch (Character.toLowerCase(letter)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(letter + " is a vowel.");
                    break;
                default:
                    System.out.println(letter + " is a consonant.");
            }
        } else {
            System.out.println("Input is not a letter.");
        }
    }
}
