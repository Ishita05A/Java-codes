package Day15;

public class LinkedListImplementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        int size = 0;
        Node head = null;

        void push(int n) {
            Node temp = new Node(n);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;

        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }

        int size() {
            return size;
        }

        void displayrec(Node head) {
            Node temp = head;
            if (temp == null)
                return;
            displayrec(temp.next);
            System.out.print(temp.data + " ");

        }

        void display() {
            displayrec(head);
            System.out.println();
        }

        void displayrev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            if (head == null)
                return true;
            return false;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.push(8);
        ll.display();
        System.out.println(ll.size());
        System.out.println(ll.pop());
        ll.display();
        ll.peek();
        System.out.println(ll.pop());
        ll.push(4);
        ll.display();
        ll.push(3);
        ll.display();
        ll.push(9);
        ll.display();
        ll.push(2);
        System.out.println(ll.size);
        ll.display();
        System.out.println(ll.peek());

    }

}
