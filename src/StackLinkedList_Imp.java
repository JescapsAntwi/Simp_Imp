public class StackLinkedList_Imp {
    private Node top;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
        //push operation
        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        //Pop operation
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int data = top.data;
            top = top.next;
            return data;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }
    }
}



