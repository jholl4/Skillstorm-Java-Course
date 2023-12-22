package day4.custom;

class CNode<E> {
    E value;
    CNode<E> nextNode;

    public CNode(E value) {
        this.value = value;
    }
}

public class CircularlyLinkedList<E> {

    private CNode<E> head;
    private CNode<E> tail;

    public CircularlyLinkedList() {

    }

    public void addNode(E value) {
        CNode<E> newNode = new CNode<>(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }
        tail = newNode;
        tail.nextNode = head;
    }

    @Override
    public String toString() {
        String values = "["; // start of list string
        // null check
        if (head == null) {
            values += "]"; // if list is empty, end with a closing bracket
        } else {
            // iterate through the nodes and get the values until we find a node where next
            // is null
            Node<E> n = head;
            while (n != null) {
                values += n.getValue(); // add each value to list string
                n = n.getNext(); // updating n to next node
                if (n != null) {
                    values += ", ";
                }
            }
            values += "]";
        }
        return values;
    }
}
