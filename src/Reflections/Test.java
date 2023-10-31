package Reflections;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> work1 = Class.forName("Reflections.Work");
//        Class<Work> work2 = Work.class;
//        Work work3ex = new Work();
//        Class<? extends Work> work3 = work3ex.getClass();
//        System.out.println(work1);
//        System.out.println(work2);
//        System.out.println(work3);

//      only public fields
        Field x = work1.getField("y");
        System.out.println("type " + x.getType());
        Field[] fields = work1.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

//      private and others fields
        System.out.println(work1.getDeclaredField("z").getName());

//      также можно получить методы класса и тд, зачем вообще с самим классом работать - я хз
    }
}
