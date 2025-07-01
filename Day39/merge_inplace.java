package Day39;

public class merge_inplace {
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

    static Node merge(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;
        Node t = new Node(100);
        Node head = t;
        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                t.next = t1;
                t = t.next;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t.next;
                t2 = t2.next;
            }
        }
        while (t1 != null) {
            t.next = t1;
            t1 = t1.next;
            t = t.next;
        }
        while (t2 != null) {
            t.next = t2;
            t2 = t2.next;
            t = t.next;
        }
        return head.next;

    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        Node s = new Node(1);
        Node t = new Node(4);
        Node u = new Node(5);
        Node v = new Node(7);
        s.next = t;
        t.next = u;
        u.next = v;
        Node head = merge(a, s);
        display(head);

    }

}
