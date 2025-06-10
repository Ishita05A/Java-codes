package Revision.Stack;

public class quest1 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        int size = 0;

        void displayrec(Node head) {
            Node temp = head;
            if (temp == null)
                return;
            displayrec(temp.next);
            System.out.print(temp.data + " ");
        }

        void display() {
            displayrec(head);
        }

        void push(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.push(6);
        ll.push(5);
        ll.push(3);
        ll.push(3);
        ll.push(1);
        ll.display();

    }

}
