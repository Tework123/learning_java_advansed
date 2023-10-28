package ThreadsCollections.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example1 {
//  хз что не так, но в данном случае с листами у меня работают все методы
//  даже оберток synchorinezid все работает, даже с удалением

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        int count = 10;

        for (int i = 0; i < count; i++) {
            list.add(i + "");
        }
        System.out.println(list);
        List<String> syncList = Collections.synchronizedList(list);

        Runnable runnable01 = () -> {

            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(list.get(i));
            }
        };

        Runnable runnable02 = () -> {

            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                syncList.add("hegllo");
                syncList.remove(i + 1);
                System.out.println("...." + i);
            }
        };

        Thread thread1 = new Thread(runnable01);
        Thread thread2 = new Thread(runnable02);


        final long endTime1 = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        final long endTime2 = System.currentTimeMillis();
        System.out.println("TIME " + (endTime2 - endTime1));

        System.out.println(syncList);
    }
}
