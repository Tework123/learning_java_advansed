package MapLesson13;

import java.util.HashMap;
import java.util.Map;

public class Tasks {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Yellow");
        map1.put(3, "green");
        for (Map.Entry str : map1.entrySet()) {
            System.out.println(str.getKey() + " " + str.getValue());
        }
        System.out.println(map1.size());
        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println(map2);
        map2.clear();
        System.out.println(map2);
        System.out.println(map2.containsKey(1));
        System.out.println(map2.containsValue("Red"));


    }
}
