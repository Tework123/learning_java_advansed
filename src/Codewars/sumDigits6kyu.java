package Codewars;

public class sumDigits6kyu {
    public static void main(String[] args) {
        int n = 493193;
        int x = 0;
        int newDigit = 0;

        while (String.valueOf(n).length() != 1) {
            while (n > 0) {
                x = n % 10;
                newDigit += x;
                n = n / 10;
            }
            n = newDigit;
            newDigit = 0;
        }

        System.out.println(n);


    }
}
