package Day38;

public class middle_of_oddLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int middle_element(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {

        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(middle_element(a));
    }
}
