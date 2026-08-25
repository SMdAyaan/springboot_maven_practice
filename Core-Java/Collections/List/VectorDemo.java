import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        // Insert
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Display
        System.out.println("Vector: " + vector);

        // Delete
        vector.remove(Integer.valueOf(20));

        System.out.println("After Deletion: " + vector);
    }
}