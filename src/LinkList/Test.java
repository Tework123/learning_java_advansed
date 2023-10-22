package LinkList;

public class Test {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.addWithIndex(15, 3);

        while(list.head != null) {
            System.out.println(list.tail);
            list.tail = list.tail.next;
        }

    }
}

