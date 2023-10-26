package SetExample;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Car> mySet = new TreeSet<>();
        Car car1 = new Car(10, 200, "kia");
        Car car2 = new Car(10, 220, "kia2");
        Car car3 = new Car(12, 240, "kia3");
        Car car4 = new Car(3, 180, "kia4");

        mySet.add(car1);
        mySet.add(car2);
        mySet.add(car3);
        mySet.add(car4);
        System.out.println(mySet);
        System.out.println(mySet.first());
        System.out.println(mySet.last());
        System.out.println("************8");

        System.out.println(mySet.headSet(car2));
        System.out.println(mySet.tailSet(car2));
        System.out.println(mySet);


//      установил сортировку по number, поэтому вот так:
        System.out.println(mySet.subSet(car4, car1));
        System.out.println(mySet.subSet(car1, car3));


    }
}

class Car implements Comparable<Car> {
    Integer number;
    Integer speed;
    String name;

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }

    public Car(int number, int speed, String name) {
        this.number = number;
        this.speed = speed;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == ((Car) o).number;
//        return Objects.equals(number, car.number) && Objects.equals(speed, car.speed) && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
//       сравнивать можем только number, а можем и остальные поля
        return Objects.hash(number);
    }

    @Override
    public int compareTo(Car car) {

        int result = this.number.compareTo(car.number);
        if (result == 0) {
            return this.name.compareTo(car.name);
        }
        return result;
    }
}






