package Day38;

import java.util.Scanner;

public class NthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int nth_Node(int n, Node head) {
        Node temp = head;
        int m = 0;
        while (temp != null) {
            m++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 1; i < m - n + 1; i++) {
            temp = temp.next;
        }
        return temp.data;

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
        System.out.println(nth_Node(4, a));
        sc.close();

    }

}
