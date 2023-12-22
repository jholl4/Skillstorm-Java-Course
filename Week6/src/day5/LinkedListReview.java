package day5;

import java.util.LinkedList;

/*
 * ArrayLists
 * - stored sequentially, contiguously in memory
 * - indexed for item lookup (fast)
 * - resizing arrays is costly
 * 
 * LinkedLists solve the shortcomings of ArrayLists
 * - not stored contiguously
 * - no random/direct access
 * - no resizing is necessary
 * 
 * LinkedLists are comprised of nodes
 * - these nodes contain pertinent data such as the value contained at an index,
 *      any metadata, and most importantly the link to the next element in the list
 * - a null value for the next indicates the end of the list (NOwhere left to go)
 * - all we need to traverse a LinkedList is the head node or the first element,
 *      then a pointer to the next element
 * 
 * LinkedList Pros:
 * - adding to the front is not as expensive as an ArrayList
 *      - it's immediate to add to the front or the tail (doubly linked list, both the head and tail)
 * - dynamic memory, no need to resize like Arrays
 * - is NOT stored contiguously, it is typically easier to store data if memory is an issue
 * - deleting elements is the same as adding, typically very quick
 * - no such thing as resizing, to add beyond the length of the list, you still have to go through
 *      the whole list
 *      - just add to the end of the list and have the old tail point to it
 * 
 * LinkedList cons:
 * - getting a value at a specific index takes longer
 *      - we must traverse through the entire chain/list before getting to the index we care about
 * - changing the value at a specific index is also slower due to having to traverse the list
 * 
 * 
 */

public class LinkedListReview {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();
        System.out.println("Initial size of our linked list is: " + myLinkedList.size());

        System.out.println("Adding Saugat");
        myLinkedList.add("Saugat");

        System.out.println("Size of our linked list is: " + myLinkedList.size());
        System.out.println(myLinkedList);

        System.out.println("Adding Sean");
        myLinkedList.add("Sean");
        System.out.println("Sean is at index " + myLinkedList.indexOf("Sean"));

        System.out.println("Adding Rod at index 1");
        myLinkedList.add(1, "Rod");
        System.out.println(myLinkedList);
    }
}
