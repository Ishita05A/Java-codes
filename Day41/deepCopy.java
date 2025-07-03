package Day41;

public class deepCopy {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
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

    static Node deep_copy(Node head) {
        Node temp = head;
        Node temp1 = new Node(0);
        Node new_head = temp1;
        while (temp != null) {
            Node a = new Node(temp.data);
            temp1.next = a;
            temp1 = temp1.next;
            temp = temp.next;
        }
        return new_head.next;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(9);
        Node c = new Node(5);
        Node d = new Node(8);
        Node e = new Node(5);
        Node f = new Node(1);
        Node g = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node head = deep_copy(a);
        display(head);
    }

}
