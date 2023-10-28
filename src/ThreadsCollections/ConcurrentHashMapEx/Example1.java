package ThreadsCollections.ConcurrentHashMapEx;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
//      работает без локов, делит элементы на сегменты, каждый поток работает с разными сегментами
//      сегментный лок
        int count = 10;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            map.put(i, String.valueOf(i));
        }
        Map<Integer, String> syncMap = Collections.synchronizedMap(map);

        Runnable runnable01 = () -> {

//          блокирует доступ к списку, пока идет итерация
            synchronized (syncMap) {
                for (Map.Entry<Integer, String> entry : syncMap.entrySet()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(entry);
                }
            }

        };

        Runnable runnable02 = () -> {
            synchronized (syncMap) {
                for (Map.Entry<Integer, String> entry : syncMap.entrySet()) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    syncMap.put(12, "kkk");
                    System.out.println(".......добавил");
                }
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

        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        for (int i = 0; i < count; i++) {
            concurrentMap.put(i, String.valueOf(i));
        }

        Runnable runnable03 = () -> {
            for (Map.Entry<Integer, String> entry : concurrentMap.entrySet()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(entry);


            }
        };
        Runnable runnable04 = () -> {
            for (Map.Entry<Integer, String> entry : concurrentMap.entrySet()) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                syncMap.put(12, "kkk");
                System.out.println(".......добавил");


            }
        };

        Thread thread3 = new Thread(runnable03);
        Thread thread4 = new Thread(runnable04);

        final long endTime3 = System.currentTimeMillis();
        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();
        final long endTime4 = System.currentTimeMillis();
        System.out.println("TIME1 " + (endTime2 - endTime1));
        System.out.println("TIME2 " + (endTime4 - endTime3));

    }
}

class MyThread1 implements Runnable {
    public void run() {
    }
}