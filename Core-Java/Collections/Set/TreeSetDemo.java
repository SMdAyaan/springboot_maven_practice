import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // Insert
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);

        // Display
        System.out.println("TreeSet: " + set);

        // Delete
        set.remove(30);

        System.out.println("After Deletion: " + set);
    }
}