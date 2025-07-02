package Day40;

public class oddEvenLL {
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

    static Node odd_evenLL(Node head) {
        Node temp_e = new Node(0);
        Node even = temp_e;
        Node temp_o = new Node(-1);
        Node odd = temp_o;
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                temp_e.next = temp;
                temp = temp.next;
                temp_e = temp_e.next;
            } else {
                temp_o.next = temp;
                temp = temp.next;
                temp_o = temp_o.next;
            }
        }
        temp_e.next = null;
        even = even.next;
        odd = odd.next;
        temp_o.next = even;
        return odd;

    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(8);
        Node f = new Node(7);
        Node g = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node head = odd_evenLL(a);
        display(head);
    }

}
