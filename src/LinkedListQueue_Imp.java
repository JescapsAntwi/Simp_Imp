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
        if(isEmpty()){
            first = newNode;
        }
        else {
            last.next = newNode;
        }
        last = newNode;
    }
    //remove from beginning
    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
    }
}

