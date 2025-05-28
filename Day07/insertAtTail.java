package Day07;

import java.util.Scanner;

public class insertAtTail {
    public static class Node {
        int data;
        Node next;
        Node prev;

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

    static Node insertattail(Node tail, int val) {
        Node temp = new Node(val);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        return tail;
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
        d = insertattail(d, 9);
        display(a);
        sc.close();

    }

}
