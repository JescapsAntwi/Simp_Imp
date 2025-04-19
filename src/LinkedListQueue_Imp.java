public class LinkedListQueue_Imp {
    private Node first;
    private Node last;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}

