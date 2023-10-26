package QueueExmaple;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> myQ = new LinkedList<>();
        myQ.add(2);
        myQ.add(31);
        myQ.add(23);
        myQ.add(9);
        myQ.add(12);

        myQ.offer(12);

        System.out.println(myQ);
        myQ.remove(31);
        System.out.println(myQ);


    }


}
