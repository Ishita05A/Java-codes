package Day07;

public class deleteAtAnyIdx {
    public static class Node {
        int data;
        Node next;
        Node prev;

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

    static void displayReverse(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
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

    static Node delete(Node head, int idx) {
        if (idx == 0 || idx == size(head)) {
            System.out.println("not possible with this code");
            return head;
        }
        Node t = head;
        for (int i = 1; i < idx; i++) {
            t = t.next;
        }
        Node s = t.next;
        Node r = s.next;
        t.next = s.next;
        r.prev = t;
        s.next = null;
        s.prev = null;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(1);
        Node d = new Node(8);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        a = delete(a, 0);
        display(a);
        displayReverse(d);
    }

}
