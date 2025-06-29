package Day37;

import java.util.Scanner;

public class LLquest1 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int length(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    static void displayReverse(Node head) {
        Node temp = head;
        if (temp == null)
            return;
        displayReverse(temp.next);
        System.out.print(temp.data + " ");
    }

    static void displayRecurively(Node head) {
        Node temp = head;
        if (temp == null)
            return;
        System.out.print(temp.data + " ");
        displayRecurively(temp.next);

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
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
        displayRecurively(a);
        System.out.println();
        System.out.println("Reverse of linked list : ");
        displayReverse(a);
        System.out.println();
        System.out.print("Length of Linked List : ");
        System.out.print(length(a));
        sc.close();
    }
}
