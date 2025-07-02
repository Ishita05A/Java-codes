package Day40;

public class reverse_iteration {
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

    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node after = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(5);
        Node e = new Node(5);
        Node f = new Node(1);
        Node g = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        display(reverse(a));
    }

}
