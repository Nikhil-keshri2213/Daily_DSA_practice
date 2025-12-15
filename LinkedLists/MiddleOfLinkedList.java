class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleOfLinkedList {
    static Node head = null;

    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        Node curr = null;
        while(fast != null && fast.next != null){
            curr = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
            if(fast == null){
                return curr;
            } else {
                return slow;
        }    
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        middleNode(head);
        System.out.println("Middle Node: " + middleNode(head).data);
    }
}
