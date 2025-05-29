package Day08;

public class quest8 {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node child;

        Node(int data) {
            this.data = data;
        }
    }

    static Node flatten(Node head) {
        Node temp = head;
        while (temp != null) {
            Node t = temp.next;
            if (temp.child != null) {
                Node c = flatten(temp.child);
                temp.next = c;
                c.prev = temp;
                while (c.next != null) {
                    c = c.next;
                }
                c.next = t;
                if (t != null)
                    t.prev = c;
            }
            temp.child = null;
            temp = t;

        }
        return head;

    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(13);
        Node e = new Node(100);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        flatten(a);
    }

}
