package StreamLessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(9);
//       optional может обработать null
        int result = list.stream().reduce((multi, x) -> multi * x).orElse(0);
//        System.out.println(result);

        List<Integer> list2 = new ArrayList<>();
        int result100 = list2.stream().reduce(1, (multi, x) -> multi * x);
        System.out.println(result100);
    }

}
