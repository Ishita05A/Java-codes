package Day39;

public class CycleLL2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int cycle(Node head) {
        Node slow = head;
        Node fast = head;
        Node temp = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        while (temp != slow) {
            slow = slow.next;
            temp = temp.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        System.out.println(cycle(a));

    }

}
