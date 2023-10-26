package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SnailSort4kyu {
    public static void main(String[] args) {


        int n = 3;
        int m = 3;
        int[][] array = new int[n][m];
        List<Integer> listResult = new ArrayList<>();


//      заполняем матрицу
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count2 += 1;
                array[i][j] = count2;
            }
        }

//      выводим матрицу на экран
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

//      логика обработки
        int count = 0;
        int circle = 0;
        for (int i = 0; i < n; i++) {
            for (int r = circle; r < m - circle; r++) {
                listResult.add(array[i][r]);
                count += 1;
            }

            for (int d = 1 + circle; d < n - 1 - circle; d++) {
                listResult.add(array[d][m - 1 - circle]);
                count += 1;
            }

            for (int l = m - 1 - circle; l > circle; l--) {
                count += 1;
                listResult.add(array[n - 1 - circle][l]);
            }

            for (int u = n - 1 - circle; u > circle; u--) {
                count += 1;
                listResult.add(array[u][circle]);
            }

            circle += 1;
            if (count > n * m) {
                break;
            }
        }

//      ListArray Integer -> array int
        int[] result = listResult.stream().mapToInt(i -> i).toArray();

        System.out.println(listResult);
        System.out.println(Arrays.toString(result));


    }
}
