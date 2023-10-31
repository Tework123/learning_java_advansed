package EnumLesson;

import java.util.Arrays;

public class Example1 {
    void method(String dayOfWeek) {
        System.out.println("Today is" + dayOfWeek);
    }

    public static void main(String[] args) {
        Today today = new Today(WeekDays.FRIDAY);
        today.daysInfo();

//      можем писать без new, так как параметры для конструктора уже заданы
        WeekDays w = WeekDays.SATURDAY;
        w.getMood();
        System.out.println(Arrays.toString(WeekDays.values()));

    }
}
