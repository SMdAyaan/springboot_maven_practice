import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // Insert
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        // Display
        System.out.println("TreeMap: " + map);
    }
}

 