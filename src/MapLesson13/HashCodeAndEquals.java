package MapLesson13;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Map<Student, Double> mapStudents = new HashMap<>();
        Student st1 = new Student("den", 22);
        Student st2 = new Student("den2", 24);
        Student st3 = new Student("den3", 25);
        Student st4 = new Student("den3", 25);
        int x = 1_000_000_000;
        mapStudents.put(st1, 4.5);
        mapStudents.put(st2, 3.5);
        mapStudents.put(st3, 3.8);
        System.out.println(mapStudents);
        System.out.println(mapStudents.containsKey(st1));


//       надо переопределить hashCode и equals для самописных классов
//      сначала сравнивается по equals, потом по hashCode
        boolean result = mapStudents.containsKey(st4);
        System.out.println(st4.hashCode());
        System.out.println(st3.hashCode());

        System.out.println(result);
        for (Map.Entry<Student, Double> entry : mapStudents.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}

class Student implements Comparable<Student> {
    String name;
    final Integer age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.age.compareTo(student.age);
    }
}