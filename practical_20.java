//Q. Write a program to implement the operation of stack using array


package Lab_Practicals;
import java.util.*;
public class practical_20 {
    public static void main(String[] args) {

        class Stack<T> {
            private ArrayList<T> A;
            private int top = -1;
            private int size;

            public Stack(int size) {
                this.size = size;
                this.A = new ArrayList<>(size);
            }

            public void push(T X) {
                if (top + 1 == size) {
                    System.out.println("Stack Overflow");
                } else {
                    top++;
                    if (A.size() > top)
                        A.set(top, X);
                    else
                        A.add(X);
                }
            }

            public T top() {
                if (top == -1) {
                    System.out.println("Stack Underflow");
                    return null;
                } else
                    return A.get(top);
            }

            public void pop() {
                if (top == -1) {
                    System.out.println("Stack Underflow");
                } else
                    top--;
            }

            public boolean empty() {
                return top == -1;
            }

            public String toString() {
                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < top; i++) {
                    ans.append(A.get(i)).append("->");
                }
                ans.append(A.get(top));
                return ans.toString();
            }
        }

        class StackDemo {
            public static void main(String[] args) {
                Stack<Integer> intStack = new Stack<>(3);
                intStack.push(10);
                intStack.push(20);
                intStack.push(30);
                System.out.println("intStack after pushing 10, 20, and 30:\n" + intStack);
                intStack.pop();
                System.out.println("intStack after pop:\n" + intStack);

                Stack<String> stringStack = new Stack<>(3);
                stringStack.push("hello");
                stringStack.push("world");
                stringStack.push("java");
                System.out.println("\nstringStack after pushing 3 elements:\n" + stringStack);
                stringStack.push("GFG"); // This will cause Stack Overflow

                Stack<Float> floatStack = new Stack<>(2);
                floatStack.push(100.0f);
                floatStack.push(200.0f);
                System.out.println("\nfloatStack after pushing 2 elements:\n" + floatStack);
                System.out.println("Top element of floatStack:\n" + floatStack.top());
            }
        }
    }
}
