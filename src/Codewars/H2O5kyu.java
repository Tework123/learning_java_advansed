package Codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class H2O5kyu {
    public static void main(String[] args) {

        boolean sc1 = false;
        boolean sc2 = false;
        String element = "";
        String formula = "Mg(OH)2";
        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < formula.length(); i++) {
            String y = String.valueOf(formula.charAt(i));
            System.out.println(y);
            int y2 = Integer.parseInt(y);
            System.out.println(y2);
//            обработать ошибку?если ошибка, то это не число, а если нет ошибки, то идем дальше

            if (String.valueOf(formula.charAt(i)).equals("(")) {
                sc1 = true;


//                if (Integer.valueOf(String.valueOf(formula.charAt(i - 1))) instanceof Integer) {
//                    count = Integer.valueOf(String.valueOf(formula.charAt(i - 1)));
//                }
                map.put(element, count);
                element = "";
            } else if (String.valueOf(formula.charAt(i)).equals(")")) {
                sc1 = false;
                map.put(element, 1);
            } else {
                element += String.valueOf(formula.charAt(i));
                System.out.println(element);

            }


        }
        System.out.println(map);


    }
}
