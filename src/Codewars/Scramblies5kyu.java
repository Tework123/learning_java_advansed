package Codewars;

import java.util.Map;

public class Scramblies5kyu {
    public static void main(String[] args) {
        String str1 = "cedewaraaossoqqyt";
        String str2 = "codewars";
        StringBuilder sb = new StringBuilder(str1);
        int count = 0;

        for (int i = 0; i < str2.length(); i++) {
            String x = String.valueOf(str2.charAt(i));
            int index = sb.indexOf(x);
            if (index != -1) {
                sb.deleteCharAt(index);
                count += 1;
            }
        }
        if (count == str2.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
