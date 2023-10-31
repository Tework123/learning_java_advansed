package StreamLessons;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Extra {
    public static void main(String[] args) {
        int[] x1 = {3, 12, 9, 0, 13, 102, 2};
        Stream<Integer> stream2 = Stream.of(3, 12, 9, 0, 13, 102, 2);
        Stream<Integer> stream3 = Stream.of(3, 12, 9, 0, 13, 102, 2);
        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
        System.out.println(stream4.collect(Collectors.toList()));

        Stream<Integer> stream0 = Stream.of(12, 12, 12, 0, 13, 102, 2);
//        stream0.distinct().forEach(System.out::println);
//        System.out.println(stream0.count());
//        System.out.println(stream0.distinct().peek(System.out::println).count());
        Map<Integer, List<Integer>> x2 = stream0.map(x -> x).collect(Collectors.groupingBy(Integer::intValue));
        System.out.println(x2);
        int max = Arrays.stream(x1).max().getAsInt();
        System.out.println(max);
        int[] limit = Arrays.stream(x1).limit(2).toArray();
        System.out.println(Arrays.toString(limit));


    }
}
