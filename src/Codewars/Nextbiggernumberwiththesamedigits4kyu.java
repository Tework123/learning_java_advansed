package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nextbiggernumberwiththesamedigits4kyu {
    public static void main(String[] args) {
        long n = 2017;
        int count = 0;
        long x = n;
        int numberSize = 0;
        while (x > 0) {
            x = x / 10;
            numberSize += 1;
        }
        long[] array = new long[numberSize];

        long x2 = n;
        for (int i = 0; i < array.length; i++) {
            array[i] = x2 % 10;
            x2 = x2 / 10;
        }
//        List<Integer> list = new ArrayList<>();

        System.out.println(Arrays.toString(array));
        int countOuter = 0;
        int countIn = 0;
        long max = 0;

        for (int i = 0; i < numberSize; i++) {
            countOuter = 0 + i;

            while (countOuter != numberSize) {

                countIn = 0;
                countIn += countOuter;

                List<Long> list = new ArrayList<>(numberSize);
                while (countIn != numberSize + countOuter) {
                    if (countIn >= numberSize) {
                        list.add(array[countIn - numberSize]);

                    } else {
                        list.add(array[countIn]);

                    }
                    countIn += 1;

                }
                System.out.println(list);
                long result = 0;
                for (int j = 0; j < list.size(); j++) {
                    result = result * 10 + list.get(j);
                }
                System.out.println(result);
                if (result > max) {
                    max = result;
                }

                countOuter += 1;
            }

        }
        if (max == n) {
            System.out.println(-1);
        } else {
            System.out.println(max);

        }
    }
}


