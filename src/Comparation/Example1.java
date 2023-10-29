package Comparation;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
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
        Collections.sort(list);
        System.out.println(list);


    }
}

class Worker implements Comparable<Worker> {
    Integer id;
    String name;

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(@NotNull Worker worker) {
//      return 1, 0, -1;
//      здесь сортируется от меньшего id к большему
//      3 способа
//        if (worker.id == this.id) {
//            return 0;
//        } else if (worker.id < this.id) {
//            return 1;
//
//        } else {
//            return -1;
//        }
//        return this.id.compareTo(worker.id);
//        return Integer.compare(this.id, worker.id);

        int res = this.name.compareTo(worker.name);
        if (res == 0) {
            res = this.id.compareTo(worker.id);
        }
        return res;
    }
}





