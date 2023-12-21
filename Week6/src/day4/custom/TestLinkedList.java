package day4.custom;

public class TestLinkedList {

    public static void main(String[] args) {
        Node<String> n = new Node<>();
        System.out.println(n); // prints null

        Node<String> n2 = new Node<>("something", null, null);
        System.out.println(n2);

        n2.setPrev(n);
        n.setNext(n2);

        System.out.println(n2);
        System.out.println(n);

        System.out.println("prev of n2 is " + n2.getPrev());
        System.out.println("next of n is " + n.getNext());

        LinkedList<String> ll = new LinkedList<>();
        System.out.println("printing ll: " + ll);
        System.out.println("ll's size is " + ll.size());

        ll.add("stuff");
        System.out.println(ll.size());

        System.out.println("printing ll's head: " + ll.getHead());
        System.out.println(ll.getHead());

        ll.add(null);
        System.out.println(ll);

        System.out.println(ll.getTail());

        ll.remove(1);
        System.out.println(ll);
        ll.remove(0);
        ll.add(null);
        ll.add("String");
        System.out.println("ll's head: " + ll.getHead());

    }

}
