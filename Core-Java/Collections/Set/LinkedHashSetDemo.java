import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Insert
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Display
        System.out.println("LinkedHashSet: " + set);

        // Delete
        set.remove("Banana");

        System.out.println("After Deletion:");
    }
}