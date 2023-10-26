package Lambda30Lesson;

import java.util.ArrayList;
import java.util.List;

public class CarInfo {
    public static void main(String[] args) {
        Car car1 = new Car("kia", 200);
        Car car2 = new Car("kia2", 190);
        Car car3 = new Car("kia3", 180);
        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);

        CarInfo info = new CarInfo();
        info.testCar(list, 180, new CheckCar());
        System.out.println("****");

        info.testCar(list, 180, new InterfaceCarCheck() {
            @Override
            public boolean check(Car car, int speed) {
                return false;
            }

        });
        System.out.println("****");

//      lambda
        info.testCar(list, 200, (Car car, int speed) -> {
            return car.speed < speed;
        });
        System.out.println("****");

//      short lambda
        info.testCar(list, 200, (car, speed) -> car.speed < speed);


    }

    void testCar(List<Car> list, int speed, InterfaceCarCheck sc) {
        for (Car car : list) {
            if (sc.check(car, speed)) {
                System.out.println(car);
            }
        }

    }

//    void printSpeedCar(List<Car> list, int speed) {
//        for (Car car : list) {
//            if (car.speed > speed) {
//                System.out.println(car);
//            }
//        }
//
//    }
//
//    void printNameCar(List<Car> list, String name) {
//        for (Car car : list) {
//            if (car.name.equals(name)) {
//                System.out.println(car);
//            }
//        }
//    }
}

interface InterfaceCarCheck {
    boolean check(Car car, int speed);

}

class CheckCar implements InterfaceCarCheck {
    @Override
    public boolean check(Car car, int speed) {
        return car.speed > speed;
    }
}



