package ArrayListLesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Methods3 {
    public static void main(String[] args) {

        //намного быстрее выполняет операции со строками, так как не создает дополнительные строки
        //в процессе работы, в отличие от String
        StringBuilder sb1 = new StringBuilder("b");
        StringBuilder sb2 = new StringBuilder("a");
        StringBuilder[] array = {sb1, sb2, sb1};

//      array -> list
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);

//        append вместо +
        array[0].append("asd");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

//      removeAll
//      удаляет все элементы одного списка из другого
        list1.removeAll(list2);
        System.out.println(list1);

//      retainAll
//      оставляет в списке только те элементы, которые есть в другом
        list1.retainAll(list2);
        System.out.println(list1);

//      contains
//      содержит ли один список все элементы другого списка
        boolean result = list1.contains(list2);
        System.out.println(result);

//      subList
//      возвращает срез элементов списка по индексам
        list2.add(1);
        list2.add(2);

//      от интерфейса? забей, какая-то хрень:
        List<Integer> list4 = list2.subList(1, 3);

        list4.add(54);
        System.out.println(list4);
//      сюда тоже 54 добавилось
        System.out.println(list2);

//      ArrayLise -> array, можно писать всегда 0
        Integer[] array3 = list2.toArray(new Integer[0]);

//      нельзя изменять этот list
        List<Integer> list5 = List.of(3, 4, 5, 6, 7);
        System.out.println(list5);
        System.out.println("***********");

        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(list2);


    }
}





