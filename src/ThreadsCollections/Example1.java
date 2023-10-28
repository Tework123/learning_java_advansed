package ThreadsCollections;

import java.util.*;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {

//      synchronized collections - обертки над стандартными
//      работают медленнее, чем concurrent collections
//      поток работает с коллекцией, ставит флаг, чтобы другой поток не трогал ее
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> listFull = new ArrayList<>();

        Runnable runnable = () -> {
            listFull.addAll(list);
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(listFull);

        List<Integer> listSync = Collections.synchronizedList(new ArrayList<>());
        Runnable runnable2 = () -> {
            listSync.addAll(list);
        };
        Thread thread3 = new Thread(runnable2);
        Thread thread4 = new Thread(runnable2);
        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();

        System.out.println(listSync);
    }
}


class MyThread1 implements Runnable {
    public void run() {
    }
}





