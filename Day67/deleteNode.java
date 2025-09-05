public class deleteNode {
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static void delete(Node temp){
        temp.data = temp.next.data;
        temp.next = temp.next.next;
    }
    public static void main(String[] args) {
         Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(0);
        Node d = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
        delete(c);
        display(a);


    }
}
