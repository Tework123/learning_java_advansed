package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigLatin5kyu {
    public static void main(String[] args) {
        String str = "Hello world !";
        String[] array = str.split(" ");
        List<Character> signs = Arrays.asList(',', '.', ':', ';', '!', '?');
        for (int i = 0; i < array.length; i++) {
            Character first = array[i].charAt(0);
            if (signs.contains(first)){
                continue;
            }
                array[i] = array[i].substring(1) + first + "ay";
        }

        System.out.println(String.join(" ", array));

    }
}
