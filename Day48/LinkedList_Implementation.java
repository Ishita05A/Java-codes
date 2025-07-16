package Day48;

import java.util.Scanner;

public class LinkedList_Implementation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static class LinkedList {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            } else {
                head = head.next;
                size--;
            }

            return head.data;

        }

        boolean isEmpty() {
            if (head == null)
                return true;
            return false;
        }

        int size() {
            return size;
        }

        void display_rec(Node head) {
            Node temp = head;
            if (temp == null)
                return;
            display_rec(temp.next);
            System.out.print(temp.data + " ");
        }

        void display() {
            display_rec(head);
            System.out.println();
        }

        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList st = new LinkedList();
        st.push(4);
        st.push(1);
        st.push(9);
        st.push(2);
        st.display();
        System.out.println(st.size());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.isEmpty());
        st.displayRev();
        sc.close();

    }

}
