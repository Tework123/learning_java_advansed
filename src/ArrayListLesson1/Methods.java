package ArrayListLesson1;

import java.util.ArrayList;
import java.util.Objects;

public class Methods {
    public static void main(String[] args) {
//      работает только с объектами классов
        ArrayList<Integer> arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
//        добавить на эту позицию
        arrayList1.add(1, 4);
//        вставить на эту позицию
        arrayList1.set(1, 8);
//        удаляем элемент по его позиции
        arrayList1.remove(2);

//        for (Integer integer : arrayList1) {
//            System.out.println(integer);
//        }
//
//        for (int i = 0; i < arrayList1.size(); i++) {
//            System.out.println(arrayList1.get(i));
//        }

        Student name1 = new Student("Masha");
        ArrayList<Student> students = new ArrayList<>();
        students.add(name1);
        System.out.println(students);
        Student name2 = new Student("Masha");

//      с переопределенным методом equals удаляется по name объекта
        students.remove(name2);
        System.out.println(students);

    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
