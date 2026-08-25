import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Insert
        list.add("A");
        list.add("B");
        list.add("C");

        // Display
        System.out.println("LinkedList: " + list);

        // Delete
        list.remove("B");

        System.out.println("After Deletion: " + list);
    }
}