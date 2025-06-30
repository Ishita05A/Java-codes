package Day38;

public class CycleLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean cycle_ll(Node head) {
        if (head.next == null)
            return false;
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;
        }
        return false;
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
        System.out.println(cycle_ll(a));
    }
}
