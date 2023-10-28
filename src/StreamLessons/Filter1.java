package StreamLessons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter1 {
    public static void main(String[] args) {
        Student st1 = new Student("nika", 20, 2);
        Student st2 = new Student("bob", 22, 4);
        Student st3 = new Student("emma", 21, 3);
        Student st4 = new Student("andru", 19, 1);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        List<Student> result = new ArrayList<>();

//        list.stream().filter(x -> x.age > 20 && x.course > 1).forEach(x -> {
//            x.age += 10;
//            System.out.println(x);
//        });

//        list.stream().filter(x -> x.age > 20 && x.course > 1).forEach(System.out::println);

//        list.stream().forEach(Utils::mySum);

        Stream<Integer> stream = Stream.of(19, 20, 21, 22, 93);
        stream.forEach(x -> {
            x += 10;
        });

    }
}


class Utils {
    public static void mySum(Student student) {
        student.age += 10;
        System.out.println("hello " + student.age);
    }
}

