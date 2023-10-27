package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfConsecutiveFibNumbers5kyu {
    public static void main(String[] args) {
        long prod = 4456077604922913920L;

        long[] result = new long[3];
        for (long i = 0; i < prod; i++) {
            if ((getFib(i) * getFib(i + 1) == prod)) {
                result[0] = getFib(i);
                result[1] = getFib(i + 1);
                result[2] = 1;
                break;
            } else if ((getFib(i) * getFib(i + 1) > prod)) {
                System.out.println("i don't search(");
                result[0] = getFib(i);
                result[1] = getFib(i + 1);
                System.out.println(getFib(i + 2) + " " + getFib(i + 3));
                break;
            } else {
                result[0] = getFib(i);
                if (prod == 1) {
                    result[0] = 1;
                    result[2] = 1;
                }
                result[1] = getFib(i + 1);
            }
        }
        System.out.println(Arrays.toString(result));

    }

    //  вычисляем фибоначи
    public static long getFib(long digit) {
        long last1 = 0;
        long last2 = 0;
        long x;
        List<Long> list = new ArrayList<>();
        for (long i = 0; i < digit; i++) {
            if (i == 0) {
                last1 = 0;
                last2 = 1;
                list.add(last1);
            }
            x = last2;
            last2 = last1 + last2;
            last1 = x;
            list.add(last1);
        }
        return list.stream().mapToLong(Long::longValue).max().orElse(0);
    }
}
