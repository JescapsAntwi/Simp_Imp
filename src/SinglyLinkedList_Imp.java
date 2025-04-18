//Concept: Nodes where each node contains data and a pointer to the next node.
public class SinglyLinkedList_Imp {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class SinglyLinkedList {
        Node head;

        //Adding at the end
        public void append(int data){
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}


