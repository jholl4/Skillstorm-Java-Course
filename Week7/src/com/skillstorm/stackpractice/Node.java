package com.skillstorm.stackpractice;

// the generic is used to store data passed onto the stack
public class Node<T> {

    private T value; // the data being stored in the node
    private Node<T> next; // the node that is next in chain. If null, then there's no next in the chain

    // we call this constructor whenever we want to create a new node that doesn'y
    // point to anything
    public Node(T value) {
        this.value = value;
    }

    // We'll call this constructor whenever we want to create a new node that points
    // to another
    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        // if the element is null, that means that there is no next element in line
        return this.next != null;
    }

}
