package Day65;
public class sortLL {
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

    static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node mergersort(Node left, Node right) {
        Node temp = new Node(-1);
        Node newhead = temp;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            } else {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }

        }
        while(left != null){
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }
        while(right != null){
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }
        return newhead.next;
    }

    static Node sort(Node head) {
        if(head == null || head.next == null) return head;
        Node mid = findMid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        left = sort(left);
        right = sort(right);
        Node newhead = mergersort(left, right);
        return newhead;

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(9);
        Node c = new Node(4);
        Node d = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        Node head = sort(a);
        display(head);
        
    }

}
