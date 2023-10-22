package ArrayListLesson1;

import java.util.ArrayList;

public class ArrayListSpeed {
    public static void main(String[] args) {
        int count = 10000000;

        final long startTime0 = System.currentTimeMillis();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = i;
        }
        final long endTime0 = System.currentTimeMillis();
        System.out.println("array millis: " + (endTime0 - startTime0));
        System.out.println("array seconds: " + (endTime0 - startTime0) / 1000);

        final long startTime0Insert = System.currentTimeMillis();
        array[count/2] = 1;
        final long endTime0Insert = System.currentTimeMillis();
        System.out.println("array millis: " + (endTime0Insert - startTime0Insert));
        System.out.println("array seconds: " + (endTime0Insert - startTime0Insert) / 1000);
        System.out.println("******************");


        final long startTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList1.add(i);
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("ArrayList1 millis: " + (endTime - startTime));
        System.out.println("ArrayList1 seconds: " + (endTime - startTime) / 1000);


        final long startTime1Insert = System.currentTimeMillis();
        arrayList1.add(count / 2, 1);
        final long endTime1Insert = System.currentTimeMillis();
        System.out.println("array millis: " + (endTime1Insert - startTime1Insert));
        System.out.println("array seconds: " + (endTime1Insert - startTime1Insert) / 1000);
        System.out.println("******************");


//      задаем количество элементов
        final long startTime2 = System.currentTimeMillis();
        ArrayList<Integer> arrayList2 = new ArrayList<>(count+10);
        for (int i = 0; i < count; i++) {
            arrayList2.add(i);
        }
        final long endTime2 = System.currentTimeMillis();
        System.out.println("ArrayList2 millis: " + (endTime2 - startTime2));
        System.out.println("ArrayList2 seconds: " + (endTime2 - startTime2) / 1000);


        final long startTime2Insert = System.currentTimeMillis();
        arrayList2.add(count / 2, 1);
        final long endTime2Insert = System.currentTimeMillis();
        System.out.println("array millis: " + (endTime2Insert - startTime2Insert));
        System.out.println("array seconds: " + (endTime2Insert - startTime2Insert) / 1000);
    }
}
