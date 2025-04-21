public class DoublyLinkedList_Imp {
    class DNode {
        int data;
        DNode next;
        DNode prev;

        public DNode(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    class DoublyLinkedList {
        DNode head;
        DNode tail;

        //Add node at the end
        public void append(int data){
            DNode newNode = new DNode(data);
            if(head == null){
                head = newNode;
                tail = newNode;
                return;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        //Add node at the beginning
        public void prepend(int data){
            DNode newNode = new DNode(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        //Print the double linkedlist forward
        public void printForward() {
            DNode current = head;
            while(current != null) {
                System.out.println(current.data + "<->");
                current = current.next.next;

            }
            System.out.println("null");
        }
        //Print the double linkedlist backward
        public void printBackward(){
            DNode current = tail;
            while(current != null){
                System.out.println(current.data + "<->");
                current = current.prev;
            }
            System.out.println("null");
        }
    }
}

//Access: O(n) -> Doesn't allow random access
//Search: O(n) ->You have to
//Insertion -> Deletion O(1) if position is known -> O(n) if position is not known




