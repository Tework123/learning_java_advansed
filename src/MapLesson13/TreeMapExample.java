package MapLesson13;

import java.util.Date;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

//         все элементы отсортированы по возрастанию
//        поиск по дереву с log(n)
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("den", 22);
        Student st2 = new Student("den2", 24);
        Student st3 = new Student("den3", 25);
        Student st4 = new Student("den3", 25);

        treeMap.put(2.4, st1);
        treeMap.put(3.4, st2);
        treeMap.put(2.9, st3);
        treeMap.put(4.4, st4);

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());

//      выводит всех, у кого балл выше 2.9
        System.out.println(treeMap.tailMap(2.9));
        System.out.println(treeMap.headMap(3.1));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());


    }

}
