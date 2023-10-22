package LinkList;

public class LinkList {
    Element head;
    Element tail;
    static int size;

    public void add(int value) {
        if (head == null) {
            Element element = new Element(value, null, null);
            head = element;
            tail = element;
        } else {
            Element element = new Element(value, head, null);
            head.next = element;
            head = element;
        }
        size += 1;

    }

    public void insert(int value) {
        if (head == null) {
            Element element = new Element(value, null, null);
            head = element;
            tail = element;
        } else {
            Element element = new Element(value, null, tail);
            tail.prev = element;
            tail = element;
        }
        size += 1;
    }

    //     don't work
    public void addWithIndex(int value, int index) {
//        if (index < 0 || index >= size)
//            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        if (index == 0) {
            insert(value);
        }
        if (index == size) {
            add(value);
        }
        int count = 0;
        Element e = tail;

        while (count != index) {
            count += 1;
            if (count == index) {
                Element element = new Element(value, tail, tail.next);
                tail.next.prev = element;
                tail.next = element;
                break;
            }
            tail = tail.next;

        }

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Don't exists");
        } else if (tail == head) {
            head = null;
            tail = null;
            System.out.println("delete last success");
        } else {
            head.prev.next = null;
            head = head.prev;

        }
        size -= 1;
    }


}



