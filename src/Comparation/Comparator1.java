package Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        Worker wk1 = new Worker(1, "hel33");
        Worker wk2 = new Worker(3, "hel21");
        Worker wk3 = new Worker(114, "hel3");
        Worker wk4 = new Worker(8, "hel4");
        list.add(wk1);
        list.add(wk3);
        list.add(wk4);
        list.add(wk2);
        System.out.println(list);
//      по стандарту сравниваем только по id, если нужно еще по другим параметрам, то
//      создаем доп классы и там переопределяем compare, подставляем этот idcomarator в list
        Collections.sort(list, new IdComarator());
        System.out.println(list);
    }
}

class IdComarator implements Comparator<Worker> {

    //     в обратном порядке вроде
    @Override
    public int compare(Worker worker, Worker worker1) {
        if (worker.id == worker1.id) {
            return 0;
        } else if (worker.id < worker1.id) {
            return 1;

        } else {
            return -1;
        }
    }
}