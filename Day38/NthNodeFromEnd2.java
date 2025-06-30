package Day38;

import java.util.Scanner;

public class NthNodeFromEnd2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int nth_Node(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(nth_Node(a, 2));
        sc.close();

    }

}
