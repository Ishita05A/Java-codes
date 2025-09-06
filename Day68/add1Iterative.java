package Day68;

public class add1Iterative {
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

    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node after = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    static Node add1_Iterative(Node head) {
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        while (temp != null) {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;
            if (carry == 0)
                break;
            if (temp.next == null && carry > 0) {
                temp.next = new Node(carry);
                carry = 0;
            }
            temp = temp.next;
        }
        head = reverse(head);
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node(9);
        Node c = new Node(9);
        a.next = b;
        b.next = c;
        Node head = add1_Iterative(a);
        display(head);
    }

}
