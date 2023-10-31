package NestedClasses;

class Test {
    public static void main(String[] args) {
        Car.Engine engine1 = new Car.Engine(120);
        Car myCar = new Car("red", 99900, engine1, 12);
        myCar.getResult(3, 4);
        System.out.println(myCar);
        Car myCar2 = new Car("black", 10000, engine1, 15) {
            @Override
            public int doThis(int a) {
                return a + a;
            }
        };

        System.out.println(myCar2.doThis(1));


    }
}

public class Car implements Ex {
    String color;
    int price;
    Engine engine;

    Koleso koleso;
    static int i;

    //  local inner class
    public void getResult(int x, int y) {
        class Result {
            int x;
            int y;

            public Result(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public void getInnerResult() {
                System.out.println(x + " Inner " + y);
            }
        }
        Result result = new Result(x, y);
        result.getInnerResult();

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", engine=" + engine + koleso.size +
                '}';
    }

    public Car(String color, int price, Engine engine, int size) {
        this.color = color;
        this.price = price;
        this.engine = engine;
        this.koleso = this.new Koleso(size);
    }

    @Override
    public int doThis(int a) {
        return a;
    }

    //  static nested class
    public static class Engine {
        int horsePower;

        @Override
        public String toString() {
            System.out.println(i + 1);
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }
    }

    //  inner class
    public class Koleso {
        int size;

        public Koleso(int size) {
            this.size = size;
        }
    }
}





