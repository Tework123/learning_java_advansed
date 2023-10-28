package MultitreadLesson33;

public class Example4Sleep {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Thread1());
        thread1.start();

//      мейн ждет поток тред1, только потом принтует свое, также может ждать какое-то время
        thread1.join(3000);

        System.out.println("I AM 2 thread, but i am first, sorry nigga");


    }
}


class Thread1 implements Runnable {
    public void run() {
        System.out.println("work start");

        try {
            System.out.println(".........");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("work end");


    }
}