package MapLesson13;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> map1 = new LinkedHashMap<>(1, 2, true);
        Student st1 = new Student("den", 22);
        Student st2 = new Student("den2", 24);
        Student st3 = new Student("den3", 25);
        Student st4 = new Student("den3", 25);
        map1.put(1, st1);
        map1.put(3, st2);
        map1.put(4, st3);
        map1.put(2, st4);
//         ненужно


        System.out.println(map1);

    }
}
