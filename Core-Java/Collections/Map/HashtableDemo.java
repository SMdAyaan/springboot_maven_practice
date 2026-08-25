import java.util.Hashtable;

public class HashtableDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        // Insert
        table.put(1, "Java");
        table.put(2, "Spring");
        table.put(3, "Hibernate");

        // Display
        System.out.println("Hashtable: " + table);

        // Delete
        table.remove(2);

        System.out.println("After Deletion: " + table);
    }
}