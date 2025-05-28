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
        Node s = head;
        Node t = new Node(val);
        for (int i = 1; i <= idx; i++) {
            s = s.next;
        }
        Node r = s.next;
        s.next = t;
        t.next = r;
        t.prev = s;
        r.prev = t;
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

    static void displayReverse(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
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
        a = insertAt(a, 2, 5);
        display(a);
        displayReverse(d);
        sc.close();
    }

}
