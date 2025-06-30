package Day38;

public class intersectionLL {
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

    static int size(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    static int intersecting_node(Node head1, Node head2) {
        int m = size(head1);
        int n = size(head2);
        Node temp1 = head1;
        Node temp2 = head2;
        if (m > n) {
            for (int i = 1; i <= m - n; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int j = 1; j < n - m; j++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1.data;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(0);
        Node e = new Node(9);
        Node x = new Node(23);
        Node y = new Node(20);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        x.next = y;
        y.next = d;
        System.out.println(intersecting_node(a, x));
    }

}
