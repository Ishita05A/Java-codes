package Day08;

public class quest5 {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean pallindrome(Node head) {
        Node temp = head;
        Node h = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = temp;
        while (h != null) {
            if (h.data != t.data)
                return false;
            t = t.prev;
            h = h.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(4);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        System.out.println(pallindrome(a));

    }

}
