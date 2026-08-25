import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Insert
        map.put(101, "Java");
        map.put(102, "Spring");
        map.put(103, "SQL");

        // Display
        System.out.println("HashMap: " + map);

        // Delete
        map.remove(102);

        System.out.println("After Deletion: " + map);
    }
}
