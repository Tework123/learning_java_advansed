package ArrayLinkedListLesson7;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student name1 = new Student("alesha", 19);
        Student name2 = new Student("alesha2", 23);
        Student name3 = new Student("alesha3", 32);
        LinkedList<Student> students = new LinkedList<>();
        students.add(name1);
        students.add(name2);
        students.add(name3);

//      вставка намного быстрее, чем в обычном листе,
//      так как меняются только две ссылки
        students.add(2, name1);
        students.remove(2);

//      get - arrayList
//      add, remove - linkedList
//      по факту - почти всегда arrayList

        System.out.println(students);
        System.out.println(students.get(2));

    }
}


class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String toString() {
        return name + " " + age;
    }

}


