package Day39;

public class merge2LL {
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
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp = new Node(100);
        Node head = temp;
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = temp1;
                temp1 = temp1.next;
                temp = temp.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
                temp = temp.next;
            }
        }
        while (temp1 != null) {
            temp.next = temp1;
            temp = temp.next;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            temp.next = temp2;
            temp = temp.next;
            temp2 = temp2.next;
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
