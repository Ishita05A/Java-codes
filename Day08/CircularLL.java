package Day08;

public class CircularLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void display(Node head) {
        Node temp = head.next;
        System.out.print(head.data + " ");
        while (temp != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = a;
        display(a);
    }

}
