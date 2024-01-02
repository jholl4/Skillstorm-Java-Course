package com.skillstorm.stackpractice;

public class MyStack<T> {

    // this node refers to whatever the top of the stack currently is
    private Node<T> top;
    // this will refer to the current size of our stack (how many elements are in
    // it)
    private int size;

    public MyStack() {
    }

    public void push(T item) {
        if (item == null) {
            throw new IllegalArgumentException("No null entries allowed!");
        }
        if (top == null) {
            // creates a new node that holds the value of the item we're trying to have
            Node<T> newTop = new Node<T>(item);
            top = newTop;
            size++;
            return;
        }
        Node<T> newTop = new Node<T>(item);
        newTop.setNext(top);
        top = newTop;
        size++;
    }

    public T pop() {
        if (top == null) {
            throw new NullPointerException("Nothing to pop!");
        }
        Node<T> node = top;
        top = top.getNext();
        size--;
        return node.getValue();
    }

    /**
     * 
     * @return value of top
     */
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return top.getValue();
    }

    /**
     * 
     * @return true if stack is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 
     * @return full size of stack
     */
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String str = "[";
        Node<T> currNode = top; // starting with the top, go through and print the full stack without removing
                                // anything
        while (currNode != null) {
            str += currNode.getValue();

            // if no next, that means we're at the final element in our stack, so no comma
            if (currNode.hasNext()) {
                // if there's a next node in the sequence, add a comma
                str += ",";
            }

            // advance our pointer
            currNode = currNode.getNext();
        }
        str += "]";
        return str;
    }

}
