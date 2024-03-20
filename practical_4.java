//Q. Write a program to check the given number is Prime or not.

package Lab_Practicals;
import java.util.*;
public class practical_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = 0;
                break;
            } else {
                flag = 1;

            }
        }
        if (flag == 1) {
            System.out.println("It's prime");
        } else if (flag == 0) {
            System.out.println("It's not prime");
        } else {
            System.out.println("no");
        }
    }
}
