//Q. Write a test program that prompts the user to enter ten numbers,
//        invoke a method to reverse the numbers, display the numbers.

package Lab_Practicals;
import java.util.*;
public class practical_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        reverse(numbers);
        System.out.println("The reversed numbers are: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void reverse(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }
}