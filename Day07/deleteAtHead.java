package Day07;

public class deleteAtHead {
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

    static Node delete(Node head) {
        Node temp = head;
        Node s = temp.next;
        s.prev = null;
        temp.next = null;
        head = s;
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
        a = delete(a);
        display(a);
        displayReverse(d);

    }

}
