package Day38;

import java.util.Scanner;

public class deleteNodeAsParameter {
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

    static void delete(Node temp) {
        temp.data = temp.next.data;
        temp.next = temp.next.next;
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
        delete(b);
        display(a);
        sc.close();
    }

}
