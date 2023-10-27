package Codewars;

import java.util.*;

public class GreedIsGood5kyu {
    public static void main(String[] args) {
        int[] dice = {1, 1, 1, 4, 1};
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < dice.length; i++) {
            if (map.containsKey(dice[i])) {
                int count = map.get(dice[i]);
                map.put(dice[i], count + 1);

            } else {
                map.put(dice[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int entire = entry.getValue() / 3;
            int remainder = entry.getValue() % 3;

            if (entry.getKey() == 1) {
                result += 1000 * entire + 100 * remainder;


            } else if (entry.getKey() == 5) {
                result += 500 * entire + 50 * remainder;

            } else {
                result += entry.getKey() * 100 * entire;
            }


        }
        System.out.println(map);
        System.out.println(result);

    }
}
