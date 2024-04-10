//Q. Write a program to sort the elements from given array of integer.
//        Specify size of array and elements of array from command line
//        argument.

package Lab_Practicals;
import java.util.*;
public class practical_18 {
    public static void main(String[] args) {
        // Check if there are enough arguments
        if (args.length < 2) {
            System.out.println("Please specify the size of the array and the elements.");
            return;
        }

        // Parse the size of the array
        int size = Integer.parseInt(args[0]);

        // Check if the size matches the number of elements
        if (args.length != size + 1) {
            System.out.println("The number of elements does not match the specified size.");
            return;
        }

        // Parse the elements of the array
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(args[i + 1]);
        }

        // Sort the array
        Arrays.sort(array);

        // Print the sorted array
        System.out.println(Arrays.toString(array));
    }
}