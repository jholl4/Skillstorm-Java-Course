package com.skillstorm.queuepractice;

import java.util.NoSuchElementException;

public class MyQueue<T> {

    /*
     * Stacks vs queues
     * 
     * Stacks are LIFO
     * - new items pushed to the stack go to the back
     * 
     * Queues are FIFO
     * - new items added to the queue go to the back of the queue and wait until
     * they get to the front
     * - think of them as a line
     * 
     * real life examples of queues:
     * - standing in line at a grocery store
     * - waiting for a representative on the phone
     * - queueing up a song at a bar
     * - gaming backlog
     * - milk jugs at a grocery store
     * 
     * When to use a queue:
     * - when you want to handle "tasks" or "items" sequentially, one at a time
     * 
     * There's also a "Dequeue" pronounced deck, which stands for double-ended queue
     * 
     * Main methods/functions for a queue
     * 1. peek() - same as the stack's peek, but returns a value of the front
     * 2. poll() - same as a stack's pop, but removes from the front
     * 3. add() - same as a stack's push, adds to the back of the list/queue
     * 4. element() - similar to peek, but will throw an exception if it fails
     * instead of a
     * value like null or false
     * 
     */

    private Node<T> front;
    private Node<T> back;
    private int size;

    public MyQueue() {
    }

    public void add(T value) {
        Node<T> newBack = new Node<>(value);
        // if there is already a back
        if (back != null) {
            // if yes, have the old back point to the new node (newback)
            back.setPrev(newBack);
        }
        newBack.setNext(back);
        back = newBack;
        if (front == null) {
            front = newBack;
        }
        size++;
    }

    public T poll() {
        if (isEmpty()) {
            throw new NoSuchElementException("Can NOT remove an element from an empty queue!");
        }
        T value = front.getValue();
        if (!front.hasPrev()) {
            back = null;
            front = null;
        } else {
            front = front.getPrev();
            front.setNext(null);
        }
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return front.getValue();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        String str = "[";
        Node<T> currNode = front; // starting with the front, go through and print the full queue without removing
                                  // anything
        while (currNode != null) {
            str += currNode.getValue();

            // if no prev, that means we're at the final element in our queue, so no comma
            if (currNode.hasPrev()) {
                // if there's another node in the sequence, add a comma
                str += ",";
            }

            // advance our pointer
            currNode = currNode.getPrev();
        }
        str += "]";
        return str;
    }

}
