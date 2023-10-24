import java.util.*;


public class Test {
    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        int[] array = {4, 6, 2};
        for (int i = 0; i < array.length; i++) {
            if (myList.contains(array[i])) {
                System.out.println(array[i]);
            }
        }

    }
}
