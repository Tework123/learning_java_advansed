package StreamLessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortedex {
    public static void main(String[] args) {
        int[] array = {3, 12, 9, 0, 13, 102, 2};
        array = Arrays.stream(array).sorted().toArray();

        Student st1 = new Student("dan", 52, 2);
        Student st2 = new Student("dan2", 22, 1);
        Student st3 = new Student("dan3", 32, 3);
        Student st4 = new Student("dan4", 12, 4);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list);


    }
}
