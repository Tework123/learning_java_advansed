package ArrayLinkedListLesson7;

import java.util.ArrayList;
import java.util.Collections;

public class ClassCollestions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 10000;
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                list.add(-i);

            } else {
                list.add(i);

            }
        }
        Collections.shuffle(list);

        Collections.reverse(list);
        Collections.sort(list);


        final long startTime2 = System.currentTimeMillis();
        int index = Collections.binarySearch(list, count - 15);
        System.out.println(index);
        final long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);

        final long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            if (count - 15 == list.get(i)) {
                System.out.println("Нашел: " + i);
            }
        }
        final long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);


    }
}
