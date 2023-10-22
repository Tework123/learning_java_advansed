package LinkList;

public class Element {
    int id;
    Element prev;
    Element next;

    Element(int value, Element prev, Element next) {
        this.id = value;
        this.prev = prev;
        this.next = next;

    }

    public String toString() {
        return "" + this.id;
    }
}
