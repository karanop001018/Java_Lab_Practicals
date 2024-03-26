//Q. Write a program to count the number of words that start with capital letters.

package Lab_Practicals;
//import java.util.*;
import java.util.regex.*;
public class practical_8 {
    public static void main(String[] args) {
                String str = "Hello, World! This is a Test String.";
                Pattern pattern = Pattern.compile("\\b[A-Z]\\w*\\b");
                Matcher matcher = pattern.matcher(str);

                int count = 0;
                while (matcher.find()) {
                    count++;
                }

                System.out.println("Number of words that start with a capital letter: " + count);
    }
}
