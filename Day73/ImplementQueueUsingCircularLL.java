package Day73;

public class ImplementQueueUsingCircularLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        void push(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
                tail = temp;
                tail.next = head;
            } else {
                tail.next = temp;
                tail = tail.next;
                tail.next = head;
            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int val = head.data;
            if (size == 1) {
                head = null;
                tail = null;
            }

            else {
                head = head.next;
                tail.next = head;
            }
            size--;
            return val;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.push(5);
        q.push(7);
        q.push(9);
        q.push(4);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.size);
        q.display();
    }

}
