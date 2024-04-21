//Q. Write a program that declares an abstract class A with an abstract
//method display( ). Provide subclasses A1 & A2 that each
//        implements this method. Create instance of these subclasses &
//        invoke that method

package Lab_Practicals;
// Abstract class A
abstract class A {
    // Abstract method
    abstract void display();
}

// Subclass A1
class A1 extends A {
    @Override
    void display() {
        System.out.println("This is implementation in A1.");
    }
}

// Subclass A2
class A2 extends A {
    @Override
    void display() {
        System.out.println("This is implementation in A2.");
    }
}

public class practical_27 {
    public static void main(String[] args) {
        // Create instances of subclasses
        A1 a1 = new A1();
        A2 a2 = new A2();

        // Invoke the display method
        a1.display();
        a2.display();
    }
}
