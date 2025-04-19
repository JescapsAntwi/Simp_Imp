public class CircularQueue_Imp {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;

    public CircularQueue_Imp(int size){
        maxSize = size + 1;
        queueArray = new int[maxSize];
        front = 0;
        rear = 0;
    }
    //add at the end
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

    }
}
