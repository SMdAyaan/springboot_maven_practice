import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Insert
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");

        // Display
        System.out.println("ArrayList: " + list);

        // Delete
        list.remove("Spring");

        System.out.println("After Deletion: " + list);
    }
}

