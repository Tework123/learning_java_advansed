package SpeedTest;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListSpeed1 {
    public static void main(String[] args) {
        int count = 10000000;

        System.out.println("****Array*****");
        int[] array = new int[count];
        final long startTime0 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            array[i] = i;
        }
        final long endTime0 = System.currentTimeMillis();
        System.out.println("array millis: " + (endTime0 - startTime0));

        final long startTime0Insert = System.currentTimeMillis();
        array[count / 2] = 1;
        final long endTime0Insert = System.currentTimeMillis();
        System.out.println("array millis: " + (endTime0Insert - startTime0Insert));


        System.out.println("****ArrayList()*****");
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            arrayList1.add(i);
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("ArrayList millis: " + (endTime - startTime));

        final long startTime1Insert = System.currentTimeMillis();
        arrayList1.add(count / 2, 1);
        final long endTime1Insert = System.currentTimeMillis();
        System.out.println("ArrayList millis: " + (endTime1Insert - startTime1Insert));


//      задаем количество элементов
        System.out.println("****ArrayList(n)*****");
        ArrayList<Integer> arrayList2 = new ArrayList<>(count + 10);
        final long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            arrayList2.add(i);
        }
        final long endTime2 = System.currentTimeMillis();
        System.out.println("ArrayList(n) millis: " + (endTime2 - startTime2));

        final long startTime2Insert = System.currentTimeMillis();
        arrayList2.add(count / 2, 1);
        final long endTime2Insert = System.currentTimeMillis();
        System.out.println("ArrayList(n) millis: " + (endTime2Insert - startTime2Insert));

        System.out.println("****LinkedList*****");
        LinkedList<Integer> linkedList = new LinkedList<>();
        final long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            linkedList.add(i);
        }
        final long endTime3 = System.currentTimeMillis();
        System.out.println("LinkedList millis: " + (endTime3 - startTime3));

        final long startTime3Insert = System.currentTimeMillis();
        linkedList.add(count / 2, 1);
        final long endTime3Insert = System.currentTimeMillis();
        System.out.println("LinkedList millis: " + (endTime3Insert - startTime3Insert));


    }
}
