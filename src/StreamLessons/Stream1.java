package StreamLessons;

import java.util.*;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("den");
        list.add("den2");
        list.add("den44");
        list.add("den334");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf((list.get(i).length())));
//        }

        List<Integer> result = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(result);

        int[] array = {5, 9, 2, 10, 12};
        int[] result2 = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(result2));

        Set<String> set = new TreeSet<>();
        set.add("den");
        set.add("den2");
        set.add("den44");
        set.add("den334");
        Set<Integer> result3 = set.stream().map(element -> element.length()).collect(Collectors.toSet());
        System.out.println(result3);
    }
}
