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
    //add at the end
    public void enqueue(int data){
        Node newNode = new Node(data);

    }
}

