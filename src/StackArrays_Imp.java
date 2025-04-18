//Concept: LIFO Structure (Last In First Out Structure)
public class StackArrays_Imp {
    class Stack {
        int maxsize;
        int[] stackArray;
        int top;

        public Stack(int size){
            maxsize = size;
            top = -1;
            stackArray = new int[maxsize];
        }
        //adding an element onto the stack
        public void push(int value) {
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            stackArray[++top] = value;
        }
        public int pop(){
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return stackArray[top--]; //decrement top after removing

        }
        public int peek() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return stackArray[top];
        }
        public boolean isEmpty(){
            return stackArray[top] == -1;
        }

        public boolean isFull() {
            return (top == maxsize - 1); //check if the top element is equal to the last valid index of the array
        }
    }
}


