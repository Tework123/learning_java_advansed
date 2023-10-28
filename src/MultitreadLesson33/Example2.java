package MultitreadLesson33;

public class Example2 extends Thread {
    public void run() {
        System.out.println("13321");
    }

    //  делаем потоки от интерфейса
    public static void main(String[] args) {
        Example2 thread0 = new Example2();
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());
        thread0.start();
        thread1.start();
        thread2.start();
        System.out.println("I AM 5 thread, but i am first, sorry nigga");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ldsllslsl");
            }
        }).start();

        new Thread(() -> System.out.println(("ooooooo"))).start();


    }
}

class MyThread3 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "add");

        }
    }
}

class MyThread4 implements Runnable {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}

