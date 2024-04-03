//Q. Assume a vehicle plate number consists of three uppercase letters
//        followed by four digits. Write a program to generate a plate
//        number

package Lab_Practicals;
import java.util.*;
public class practical_12 {
    public static void main(String[] args) {
        Random rand = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder plateNumber = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char letter = alphabet.charAt(rand.nextInt(alphabet.length()));
            plateNumber.append(letter);
        }

        for (int i = 0; i < 4; i++) {
            int digit = rand.nextInt(10);
            plateNumber.append(digit);
        }

        System.out.println("Generated plate number: " + plateNumber.toString());
    }
}