import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // Insert
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Display
        System.out.println("HashSet: " + set);

        // Delete
        set.remove("Banana");

        System.out.println("After Deletion: " + set);
    }
}