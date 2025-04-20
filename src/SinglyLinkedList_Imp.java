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
            Node current = head; //initialize and start at the head node

            //loop stops when we reach tail node
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        //Add at the beginning
        public void prepend(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        //DeleteWithValue
        public void deleteWithValue(int data) {
            if (head == null) {
                return;
            }
            if(head.data == data){
                head = head.next;
                return;
            }
            Node current = head;
            while(current.next != null) {
                if(current.next.data == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }
    }
    //Print the linkedlist
    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;

        }
        System.out.println("null");

    }
}






