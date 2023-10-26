package QueueExmaple;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExmaple {
    //    можно добавлять в начало или конец очереди, также брать, двунаправленная
    public static void main(String[] args) {
        Deque<Integer> myD = new ArrayDeque<>();
        myD.add(1);
        myD.addFirst(12);
        myD.addLast(122);
        myD.offer(1233);
        System.out.println(myD.getFirst());
        System.out.println(myD.getLast());
        for(Integer item : myD) {
            System.out.println(item);
        }


    }
}
