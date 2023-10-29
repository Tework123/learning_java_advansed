package Codewars;

import java.util.ArrayList;
import java.util.List;

//  не сам решил, сорри
public class Shuffle {
    // Driver code
    public static void main(String[] args) {
        String s = "geekasd";
        List<String> list = new ArrayList<>();
        singlePermutationsGo(s, "", list);
        System.out.println(list);
    }

    static void singlePermutationsGo(String str,
                                     String ans, List<String> list) {

        if (str.length() == 0) {

            System.out.print(ans + " ");
            list.add(ans);
            System.out.println(1);
            return;
        }

        boolean alpha[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // If the character has not been used
            // then recursive call will take place.
            // Otherwise, there will be no recursive
            // call
            if (alpha[ch - 'a'] == false)
                singlePermutationsGo(ros, ans + ch, list);
            alpha[ch - 'a'] = true;
        }
    }


}
