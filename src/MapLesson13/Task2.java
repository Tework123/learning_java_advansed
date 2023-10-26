package MapLesson13;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "nik");
        map1.put(2, "nik2");
        map1.put(3, "nik3");
        map1.put(4, "nik4");
        map1.put(5, "nik5");
        System.out.println(map1);
        Map<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            map2.put(entry.getValue(), entry.getKey());

        }
        System.out.println(map2);

    }
}
