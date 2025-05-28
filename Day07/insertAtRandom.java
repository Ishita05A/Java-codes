package Day07;

import java.util.Scanner;

public class insertAtRandom {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertAt(Node head, int idx, int val) {
        Node t = head;
        Node temp = new Node(val);
        for (int i = 1; i <= idx; i++) {
            t = t.next;
        }
        temp.next = t.next;
        t.next = temp;
        t.next.prev = temp;
        return head;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        insertAt(a, 2, 5);
        display(a);
        sc.close();
    }

}
