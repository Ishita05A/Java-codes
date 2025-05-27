package Day06;

public class DLLdataStruc {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static class doublyLL {
        Node head = null;
        Node tail = null;

        Node insertAtHead(int val, Node head) {
            Node temp = new Node(val);
            temp.next = head;
            head.prev = temp;
            head = temp;
            return head;
        }

        void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        doublyLL dll = new doublyLL();
        Node newHead = dll.insertAtHead(1, a);
        dll.display(newHead);

    }

}
