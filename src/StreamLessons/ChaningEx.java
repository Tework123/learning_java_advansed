package StreamLessons;

import java.util.Arrays;

public class ChaningEx {
    public static void main(String[] args) {
        int[] array = {3, 12, 9, 0, 13, 102, 2};
        int result = Arrays.stream(array).filter(x -> x % 2 == 1).map(x -> {
            if (x % 3 == 0) {
                x = x / 3;
            }
            return x;
        }).reduce((sum, x) -> sum + x).orElse(0);

        System.out.println(result);

        int[] array2 = Arrays.stream(array).filter(x -> x < 10).toArray();
        System.out.println(Arrays.toString(array2));
    }


}
