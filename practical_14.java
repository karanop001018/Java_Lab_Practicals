//Q. Write a program that reads an integer and displays all its smallest
//        factors in increasing order. For example if input number is 120, the
//        output should be as follows:2,2,2,3,5

package Lab_Practicals;
import java.util.*;
public class practical_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("The smallest factors of " + number + " are:");
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + ",");
                number /= i;
            }
        }
    }
}