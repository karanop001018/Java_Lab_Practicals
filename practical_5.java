//Q. Write a program that prompts the user to enter three integers and
//        display the maximum number among these numbers.

package Lab_Practicals;
import  java.util.*;
public class practical_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number a : ");
        float a = sc.nextFloat();
        System.out.print("Enter second number b : ");
        float b = sc.nextFloat();
        System.out.print("Enter third number c : ");
        float c = sc.nextFloat();
        if(a>b && b>c){
            System.out.print("a is greatest of the all three.");
        }
        else if(a<b && b>c){
            System.out.print("b is greatest of the all three");
        }
        else{
            System.out.print("c is greatest of all the three");
        }
    }
}
