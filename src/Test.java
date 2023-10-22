import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        ArrayList<Object> listDigital = new ArrayList<>();
        listDigital.add(1);
        listDigital.add(2);
        listDigital.add(13);
        listDigital.add("asd");
        System.out.println(listDigital);

        ArrayList<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < listDigital.size(); i++) {
            if (listDigital.get(i) instanceof Integer) {
                list.add(listDigital.get(i));
            }
        }
        System.out.println(list);


    }
}
