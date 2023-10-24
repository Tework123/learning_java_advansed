import java.util.ArrayList;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        String start = "10.0.0.50";
        String end = "255.255.255.255";
        String[] startArray = start.split("\\.");
        String[] endArray = end.split("\\.");
        int[] startArrayD = new int[startArray.length];
        int[] endArrayD = new int[endArray.length];

        for (int i = 0; i < startArray.length; i++) {
            startArrayD[i] = Integer.parseInt(startArray[i]);
        }
        for (int i = 0; i < endArray.length; i++) {
            endArrayD[i] = Integer.parseInt(endArray[i]);
        }

        System.out.println(Arrays.toString(startArrayD));
        System.out.println(Arrays.toString(endArrayD));

        long result = 0;
        long result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;


        result1 += (long) (endArrayD[0] - startArrayD[0]) * 256 * 256 * 256;
        System.out.println(result1);
        result2 += (endArrayD[1] - startArrayD[1]) * 256 * 256;
        result3 += (endArrayD[2] - startArrayD[2]) * 256;
        result4 += (endArrayD[3] - startArrayD[3]);
        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
        result = result1 + result2 + result3 + result4;
        System.out.println(result);

    }
}
