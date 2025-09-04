package Day67;

public class add2noLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
        static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
        static Node reverse(Node head){
            Node curr = head;
            Node prev = null;
            Node after = null;
            while(curr != null){
                after = curr.next;
                curr.next = prev;
                prev = curr;
                curr = after;
            }
            return prev;
        }
        static Node add2LL(Node head1, Node head2){
            Node temp1 = head1;
            Node temp2 = head2;
            Node temp = new Node(-1);
            Node a = temp;
            while(temp1 != null || temp2 != null){
                int val = temp1.data + temp2.data;
                temp.next = new Node(val);
                temp = temp.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            Node newhead = reverse( a.next);
            return newhead;
            
        }

        public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(6);
            Node u = new Node(4);
            Node v = new Node(5);
            Node w = new Node(2);
            a.next = b;
            b.next = c;

            u.next = v;
            v.next = w;
            Node head = add2LL(a, u);
            display(head);


        }

    }
}
