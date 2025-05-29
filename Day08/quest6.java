package Day08;

public class quest6 {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    static void targetSum(Node head, int target) {
        Node t = head;
        Node s;
        while (t.next != null) {
            s = t.next;
            while (s.next != null) {
                if (t.data + s.data == target) {
                    System.out.println(t.data);
                    System.out.println(s.data);
                }
                s = s.next;
            }
            t = t.next;
        }
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
        targetSum(a, 16);

    }

}
