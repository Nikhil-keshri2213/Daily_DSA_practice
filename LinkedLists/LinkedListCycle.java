class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCycle {
    static Node head;

    public static void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    public static boolean HasCycle(){
        Node slow;
        Node fast;
        if(head == null){
            return false;
        }
        slow = head;
        fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        head = new Node(0);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        // Creating a cycle for testing
        head.next.next.next.next.next = head.next.next; // 50 -> 30
        if(HasCycle()){
            System.out.println("Linked List has a cycle.");
        } else {
            System.out.println("Linked List has no cycle.");
            printList();
        }
    }
}
