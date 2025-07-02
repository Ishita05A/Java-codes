package Day40;

public class Max_twin_sum {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
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

    static int max_twin_sum(Node head) {
        Node slow = head;
        Node fast = head;
        Node p1 = head;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node p2 = reverse(slow.next);
        slow.next = p2;
        while (p2 != null) {
            sum = p1.data + p2.data;
            if (sum > max)
                max = sum;
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;
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
        System.out.println(max_twin_sum(a));
    }

}
