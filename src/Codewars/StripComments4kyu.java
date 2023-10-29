package Codewars;

import java.util.Arrays;

public class StripComments4kyu {
    public static void main(String[] args) {
        String text = "apples, pears # and bananas\ngrapes\nbananas !apples";
        String[] commentSymbols = {"#", "!"};
        StringBuilder result = new StringBuilder();
        boolean flagDel = false;
        for (int i = 0; i < text.length(); i++) {
//            System.out.println(text.charAt(i));
            if (String.valueOf(text.charAt(i)).equals("\n")) {
                flagDel = false;

            }
            if (Arrays.asList(commentSymbols).contains(String.valueOf(text.charAt(i)))) {
                flagDel = true;
            }
            if (flagDel) {
                continue;

            } else {
//                if (String.valueOf(text.charAt(i)).equals("\n")) {
//                    continue;
//                }
//                System.out.println(text.charAt(i));
                result.append(text.charAt(i));


            }
        }
        String[] result2 = result.toString().split(" ");
        System.out.println(Arrays.toString(result2));
        for (int i = 0; i < result2.length; i++) {
            if (result2[i].contains("\n")) {
                System.out.println(11111111);
                System.out.println(result2[i]);
                result2[i] = result2[i].trim()+"\n";

            } else {
                result2[i] = result2[i].replaceAll("\\s+","");

            }
        }
        String result3 = String.join(" ", result2);
        System.out.println(result3);
        System.out.println(result3.length());

//        for(int i = 0; i < result.s)
        System.out.println("****");

//        System.out.println(result.toString().replaceAll(" ", " ").length());

        for (int i = 0; i < result.length(); i++) {
//            System.out.println(result.charAt(i));
        }

    }
}
