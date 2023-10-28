package MultitreadLesson33;

public class Example1 {
    //  делаем потоки от класса

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread = new MyThread1();
        myThread1.start();
        myThread.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "add");

        }
    }
}

class MyThread2 extends MyThread1 {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}


