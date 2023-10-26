package QueueExmaple;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    //    автоматом сортирует
    public static void main(String[] args) {
        PriorityQueue<Car> priorityQueue = new PriorityQueue<>();
        Car priorityQueue1 = new Car(10, 200, "kia");
        Car priorityQueue2 = new Car(10, 220, "kia2");
        Car priorityQueue3 = new Car(12, 240, "kia3");
        Car priorityQueue4 = new Car(3, 180, "kia4");

        priorityQueue.add(priorityQueue1);
        priorityQueue.add(priorityQueue2);
        priorityQueue.add(priorityQueue3);
        priorityQueue.add(priorityQueue4);
        priorityQueue.remove();
        for(Car item : priorityQueue) {
            System.out.println(item);
        }


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






