package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ismyfriendcheating5kyu {
    public static void main(String[] args) {
        long n = 42134;
        long a = 0;
        long b = 0;
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        List<long[]> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a = i;
            for (int j = 0; j < n; j++) {
                b = j;
                if (a * b == sumNoAB(sum, a, b)) {
                    System.out.println(a + " " + b);
                    long[] ab = new long[2];
                    ab[0] = a;
                    ab[1] = b;
                    result.add(ab);
                }
            }
        }
        for (long[] el : result) {
            System.out.println(Arrays.toString(el));
        }
        ;
    }

    public static long sumNoAB(long sum, long a, long b) {
        sum -= a;
        sum -= b;
        return sum;

    }

}
