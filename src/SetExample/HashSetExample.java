package SetExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    //  основан на hashMap, с ключом, но без значения(с заглушкой)
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(2);
        mySet.add(21);
        mySet.add(42);
        mySet.add(7);
        mySet.add(11);

        Set<Integer> mySet2 = new HashSet<>();
        mySet2.add(2);
        mySet2.add(42);
        mySet2.add(1);
        mySet2.add(23);
        mySet2.add(3);

        Set<Integer> unionSet = new HashSet<>(mySet);
        unionSet.addAll(mySet2);
        System.out.println(unionSet);

        Set<Integer> intersectSet = new HashSet<>(mySet);

        intersectSet.retainAll(mySet2);
        System.out.println(intersectSet);

        Set<Integer> subtractSet = new HashSet<>(mySet);
        subtractSet.removeAll(mySet2);
        System.out.println(subtractSet);


    }
}
