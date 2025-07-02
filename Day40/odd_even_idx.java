package Day40;

public class odd_even_idx {
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

    static Node oddEvenLL(Node head) {
        Node even = new Node(0);
        Node odd = new Node(0);
        Node tempe = even;
        Node tempo = odd;
        Node temp = head;
        while (temp != null) {
            tempo.next = temp;
            temp = temp.next;
            tempo = tempo.next;

            tempe.next = temp;
            if (temp == null)
                break;
            tempe = tempe.next;
            temp = temp.next;

        }
        even = even.next;
        odd = odd.next;
        tempo.next = even;
        return odd;
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
        Node head = oddEvenLL(a);
        display(head);
    }

}
