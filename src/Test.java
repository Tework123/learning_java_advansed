import java.util.*;


public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3,};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            list.clear();
            list.add(array[i]);
            for (int j = 1; j < array.length; j++) {
                list.add(array[j]);
                for (int k = 2; k < array.length; k++) {
                    list.add(array[i]);
                }

            }
            System.out.println(list);
        }



    }
}