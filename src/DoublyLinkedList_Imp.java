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
        }

    }
}

