package ArrayListLesson1;

import java.util.ArrayList;

public class Methods2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();

        arrayList1.add(1);
        arrayList1.add(1);
        arrayList2.addAll(arrayList1);
        arrayList2.addAll(2, arrayList1);
        arrayList2.add(2);
        System.out.println(arrayList2);

//      ищет индекс элемента
        int index = arrayList2.indexOf(2);
        System.out.println(index);

        arrayList2.clear();
        System.out.println(arrayList2);


        Student name1 = new Student("Masha");
        ArrayList<Student> students = new ArrayList<>();
        students.add(name1);

//      по name2 может найти только с переопределенным equals
        Student name2 = new Student("Masha");

        int index2 = students.indexOf(name1);
        System.out.println(index2);


    }
}
