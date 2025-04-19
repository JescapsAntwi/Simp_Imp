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
        int data = first.data;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        return data;
    }
    //take a peek at the first element
    public int peek() {
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }
}
//Enqueue: O(1)
//Dequeue: O(1)
//Peek: O(1)
