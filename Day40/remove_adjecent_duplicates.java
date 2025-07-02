package Day40;

public class remove_adjecent_duplicates {
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

    static Node removeDuplicate(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.data != temp.data) {
                temp = temp.next;
            } else
                temp.next = temp.next.next;
        }
        return head;
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
        Node head = removeDuplicate(a);
        display(head);
    }
}
