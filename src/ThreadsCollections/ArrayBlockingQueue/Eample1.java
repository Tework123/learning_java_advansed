package ThreadsCollections.ArrayBlockingQueue;

import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

public class Eample1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(100);
        int count = 10;
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);

        Runnable runnable01 = () -> {
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int x = queue.poll();
                System.out.println(".......забрал" + x);
            }
        };
        Runnable runnable02 = () -> {
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                queue.add(10);
                System.out.println(".......добавил" + i);
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

    }
}
