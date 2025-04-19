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
}
