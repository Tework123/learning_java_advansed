package ArrayLinkedListLesson7;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPal = true;
        while (iterator.hasNext() && reverseIterator.hasNext()) {
            if (iterator.next() != reverseIterator.previous()){
                isPal = false;
                break;
            }
        }
        System.out.println(isPal);

    }
}
