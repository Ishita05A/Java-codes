package Day63;

public class deleteNode {
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
    static void Node(Node node){
        node.data = node.next.data;
        node.next = node.next.next;


    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(9);
        Node e = new Node(0);
        Node f = new Node(9);
        a.next=b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        Node(c);
        display(a);
    }
    
}
