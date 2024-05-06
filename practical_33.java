import java.util.LinkedList;

public class practical_33 {
    public static void main(String[] args) {
        LinkedList<String> input = new LinkedList<>();
        input.add("Karan");
        input.add("Karsh");
        System.out.println("Linked List: " + input);
        input.addFirst("Kunj");
        System.out.println("Linked List after adding an element to the beginning: " + input);
        input.addLast("Kavi");
        System.out.println("Linked List after adding an element to the end: " + input);
        input.remove("Kunj");
        System.out.println("Linked List after removing an element: " + input);
        int len = input.size();
        System.out.println("Size of the linked list: " + len);
        String element = input.get(2);
        System.out.println("Element at index 2: " + element);
    }
}