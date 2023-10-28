package Codewars;

public class WhatsaPerfectPoweranywaykyu5 {
    public static void main(String[] args) {
        int n = 8;
        String x = String.valueOf(n);
        int count = x.length();
        int[] result = new int[2];
        boolean flag1 = false;
        double x2 = Math.sqrt(n);
        for (int i = 0; i < n / x2 + count; i++) {
            for (int j = 0; j < n / x2 + 1; j++) {
                if (Math.pow(i, j) == n) {
                    System.out.println(i + " " + j);
                    result[0] = i;
                    result[1] = j;
                    flag1 = true;
                    break;
                }
            }
            if (flag1) {
                break;
            }


        }
        if (result[0] == 0 && result[1] == 0) {
            System.out.println(21);
        }
    }
}
