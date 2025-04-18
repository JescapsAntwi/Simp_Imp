//Concept: FIFO (First In First Out) Structure
public class Queue_ArrayImp {
    private int maxsize;
    int[] arrayQueue;
    private int front;
    private int rear;
    private int nItems;

    public arrayQueue(int size) {
        maxsize = size;
        arrayQueue = new int[maxsize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    //Adding at the end (enqueue)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if(rear == maxsize - 1) {
            rear = -1;
        }
        arrayQueue[++rear] = value;
        nItems++;
    }

    //removing at the beginning (dequeue)
    public int dequeue(){
        if(isEmpty) {
            System.out.println("Queue is empty");
        }
    }
}
