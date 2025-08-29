package Day63;



public class reverseRecursion {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
         }
    }
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(9);
        Node e = new Node(9);
        Node f = new Node(9);
        a.next=b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node head = reverse(a);
        display(head);
    }
    
}
