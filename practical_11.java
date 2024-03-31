//Q. Write a program that creates a Random object and displays the first 100 random
//        integers between 1 and 49 using the NextInt (49) method.

package Lab_Practicals;
import java.util.*;
public class practical_11 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int number = rand.nextInt(49) + 1;
            System.out.println(number);
        }
    }
}