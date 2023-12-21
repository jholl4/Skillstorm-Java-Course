package day4.custom;

import java.util.NoSuchElementException;

public class LinkedList<E> {

    private Node<E> head;
    private Node<E> tail;

    private int size;

    public LinkedList() {

    }

    public int size() {
        return size;
    }

    public void add(E e) {
        // check size of list
        if (size == 0) {
            head = new Node<E>(e, null, null); // create new node using argument element and assign to head
            tail = head; // since there is only one node, it is both the head and tail of the list
            size++;
        } else {
            // appending to end of list
            Node<E> n = new Node<E>(e, null, null); // create new node using argument as value
            Node<E> oldTail = tail; // create old tail equal to new tail
            tail = n; // update tail
            n.setPrev(oldTail); // update the tail's prev
            oldTail.setNext(n); // update the oldtail's next
            size++;
        }
    }

    public E get(int index) {
        // check if index is valid
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("index: " + index + ", Size: " + size);
        }
        Node<E> n = head;

        for (int i = 0; i < index; i++) { // traverse the list equal to the amount of the index given
            n = n.getNext();
        }
        return n.getValue();
    }

    public E remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("index: " + index + ", Size: " + size);
        }
        Node<E> n = head;
        // case where there is only one element
        if (size == 1) {
            n = head;
            head = null;
            tail = null;
        }
        // case where the index is the last element
        else if (index == size - 1) {
            n = tail;
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }
        // case there the index is the first element
        else if (index == 0) {
            n = head;
            head.getNext().setPrev(null);
            head = head.getNext();
        }
        // case where index is a middle element
        else {
            n = head;
            for (int i = 0; i < index; i++) {
                n = n.getNext();
            }
            // sets the prev's next-pointer to the next next since we're removing n
            n.getPrev().setNext(n.getNext());
            // set the next prev to the prev prev
            n.getNext().setPrev(n.getPrev());
        }
        size--;
        return n.getValue();

    }

    // returns the index of the first occurrence, if not found returns -1
    public int indexOf(E e) {
        // if the list is empty, throw an exception
        if (size == 0) {
            throw new NoSuchElementException("List is empty");
        }
        Node<E> n = head;
        for (int i = 0; i < size; i++) {
            // compare n.value and e
            if (e == null && n.getValue() == null) {
                return i;
            } else if (e.equals(n.getValue())) {
                return i;
            } else {
                n = n.getNext();
            }
        }
        return -1;
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

    Node<E> getHead() {
        return head;
    }

    Node<E> getTail() {
        return tail;
    }

}
