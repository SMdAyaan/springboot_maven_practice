import java.util.*;
import java.util.stream.*;

public class streams {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(
                        10,20,30,40,50,
                        20,30,60,70);

        // filter
        System.out.println(
            numbers.stream()
                   .filter(n -> n > 30)
                   .collect(Collectors.toList())
        );

        // map
        System.out.println(
            numbers.stream()
                   .map(n -> n * 2)
                   .collect(Collectors.toList())
        );

        // distinct
        System.out.println(
            numbers.stream()
                   .distinct()
                   .collect(Collectors.toList())
        );

        // sorted ascending
        System.out.println(
            numbers.stream()
                   .sorted()
                   .collect(Collectors.toList())
        );

        // sorted descending
        System.out.println(
            numbers.stream()
                   .sorted(
                       Comparator.reverseOrder())
                   .collect(Collectors.toList())
        );

        // limit
        System.out.println(
            numbers.stream()
                   .limit(3)
                   .collect(Collectors.toList())
        );

        // skip
        System.out.println(
            numbers.stream()
                   .skip(3)
                   .collect(Collectors.toList())
        );

        // count
        System.out.println(
            numbers.stream()
                   .count()
        );

        // anyMatch
        System.out.println(
            numbers.stream()
                   .anyMatch(n -> n > 50)
        );

        // allMatch
        System.out.println(
            numbers.stream()
                   .allMatch(n -> n > 5)
        );

        // noneMatch
        System.out.println(
            numbers.stream()
                   .noneMatch(n -> n < 0)
        );

        // findFirst
        System.out.println(
            numbers.stream()
                   .findFirst()
                   .orElse(-1)
        );

        // findAny
        System.out.println(
            numbers.stream()
                   .findAny()
                   .orElse(-1)
        );

        // max
        System.out.println(
            numbers.stream()
                   .max(Integer::compareTo)
                   .orElse(-1)
        );

        // min
        System.out.println(
            numbers.stream()
                   .min(Integer::compareTo)
                   .orElse(-1)
        );

        // sum
        System.out.println(
            numbers.stream()
                   .mapToInt(Integer::intValue)
                   .sum()
        );

        // average
        System.out.println(
            numbers.stream()
                   .mapToInt(Integer::intValue)
                   .average()
                   .orElse(0)
        );

        // reduce
        System.out.println(
            numbers.stream()
                   .reduce(0, Integer::sum)
        );
    }
}