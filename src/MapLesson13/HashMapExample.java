package MapLesson13;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
//        map (key:valus)
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(11133, "den");
        map1.put(1112, "den");
        map1.put(331, "sacha");

        map1.putIfAbsent(111, "den");
        System.out.println(map1.get(11123));
        map1.remove(331);
        System.out.println(map1.containsKey(331));
        System.out.println(map1.containsValue("den"));

        System.out.println(map1.keySet());
        System.out.println(map1.values());


        System.out.println(map1);
        System.out.println(map1.get(331));


    }
}
