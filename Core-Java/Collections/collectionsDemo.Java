import java.util.*;

public class collectionsDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                new ArrayList<>(Arrays.asList(50, 10, 30, 20, 40));

        System.out.println("Original List: " + numbers);

        // Sorting
        Collections.sort(numbers);
        System.out.println("sort(): " + numbers);

        // Reverse
        Collections.reverse(numbers);
        System.out.println("reverse(): " + numbers);

        // Shuffle
        Collections.shuffle(numbers);
        System.out.println("shuffle(): " + numbers);

        // Min
        System.out.println("min(): " +
                Collections.min(numbers));

        // Max
        System.out.println("max(): " +
                Collections.max(numbers));

        // Binary Search (must be sorted)
        Collections.sort(numbers);
        int index =
                Collections.binarySearch(numbers, 30);

        System.out.println("binarySearch(30): " +
                index);

        // Frequency
        numbers.add(30);
        System.out.println("frequency(30): " +
                Collections.frequency(numbers, 30));

        // Replace All
        Collections.replaceAll(numbers, 30, 99);
        System.out.println("replaceAll(): " +
                numbers);

        // Rotate
        Collections.rotate(numbers, 2);
        System.out.println("rotate(2): " +
                numbers);

        // Swap
        Collections.swap(numbers, 0, 1);
        System.out.println("swap(): " +
                numbers);

        // Fill
        List<String> words =
                new ArrayList<>(Arrays.asList(
                        "A", "B", "C"));

        Collections.fill(words, "Java");

        System.out.println("fill(): " + words);

        // Copy
        List<String> source =
                Arrays.asList("Spring",
                              "Hibernate",
                              "Kafka");

        List<String> destination =
                new ArrayList<>(
                        Arrays.asList("", "", ""));

        Collections.copy(destination, source);

        System.out.println("copy(): " +
                destination);

        // Disjoint
        List<Integer> list1 =
                Arrays.asList(1, 2, 3);

        List<Integer> list2 =
                Arrays.asList(4, 5, 6);

        System.out.println("disjoint(): " +
                Collections.disjoint(list1, list2));

        // Unmodifiable List
        List<String> immutable =
                Collections.unmodifiableList(source);

        System.out.println("unmodifiableList(): "
                + immutable);

        // Synchronized List
        List<Integer> syncList =
                Collections.synchronizedList(
                        new ArrayList<>());

        syncList.add(100);

        System.out.println("synchronizedList(): "
                + syncList);

        // Empty collection
        List<String> emptyList =
                Collections.emptyList();

        System.out.println("emptyList(): "
                + emptyList);

        // Singleton collection
        Set<String> singleton =
                Collections.singleton("Java");

        System.out.println("singleton(): "
                + singleton);
    }
}