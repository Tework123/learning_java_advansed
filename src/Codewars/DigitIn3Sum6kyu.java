package Codewars;

public class DigitIn3Sum6kyu {
    public static void main(String[] args) {
        int number = 1652;
        int sum = 0;
        int numberCopy = number;
        int numberLength = String.valueOf(number).length();
        while (number > 0) {
            sum += (int) Math.pow(number % 10, numberLength);
            number = number / 10;
        }
        if (numberCopy == sum) {
            System.out.println("TRUe");
        }
        System.out.println(sum);
        System.out.println(number);
        System.out.println(numberCopy);

    }
}
