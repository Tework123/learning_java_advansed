package Lambda30Lesson;

public class exmapl {
    public static void main(String[] args) {
        mySum(1, 2);

//      lambda
//        int result2 =  mySum2

//      short lambda


    }

    static int mySum(int x, int y) {
        return x + y;

    }
}

interface InterfaceMySum {
    public int sum(int x, int y);
}