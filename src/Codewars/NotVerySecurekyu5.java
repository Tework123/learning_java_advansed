package Codewars;

public class NotVerySecurekyu5 {
    public static void main(String[] args) {
//        String s = "nRPzu６Lq0qq75９jFszsjpJtBqZqkKC3H";
        String s = "a63VdB5K9g6raYTCJf4D5S4_PYhYU";
        String ex = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

//      требует латинские буквы, цифры или _
        if (s.matches("[A-Za-z0-9-_]+")) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }


    }
}
