package Day38;

public class Delete_middle {
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

    static Node delete(Node head) {
        Node slow = head;
        Node fast = head;
        if (head.next == null) {
            head = head.next;
            return head;
        }
        while (fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        Node head = delete(a);
        display(head);

    }

}
