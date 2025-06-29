package Day37;

import java.util.Scanner;

public class LLquest2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtBegining(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtend(int val) {
            Node temp = new Node(val);
            if (head == null) {
                tail = temp;
                head = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAt(int idx, int val) {
            if (idx == 1)
                insertAtBegining(val);
            else if (idx == size) {
                insertAtend(val);
                return;
            }

            else {
                Node t = new Node(val);
                Node temp = head;
                for (int i = 1; i < idx - 1; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
                size++;
            }
        }

        void deleteAt(int idx) {
            if (idx == 1) {
                head = head.next;
            }

            else {
                Node temp = head;
                for (int i = 1; i < idx - 1; i++) {
                    temp = temp.next;
                }
                if (idx == size) {
                    tail = temp;
                } else {
                    temp.next = temp.next.next;
                }

            }
            size--;
        }

        int getAt(int idx) {
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void display() {
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
        linkedlist ll = new linkedlist();
        ll.insertAtBegining(7);
        ll.insertAtBegining(9);
        ll.insertAtend(3);
        ll.insertAt(3, 5);
        ll.display();
        System.out.println(ll.getAt(3));
        System.out.println(ll.size);
        ll.deleteAt(4);
        ll.display();
        sc.close();

    }

}
