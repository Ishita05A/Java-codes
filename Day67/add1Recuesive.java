

public class add1Recuesive {
    public static class Node{
        int data;
        Node next;
        Node(int data){
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
    static int helper(Node temp){
        if(temp == null) return 1;
        int carry = helper(temp.next);

        temp.data = temp.data + carry;
        if(temp.data >=10){
            temp.data = 0;
            return 1;
        }
        return 0;

    }
    static Node add1(Node head){
        int carry = helper(head);
        if(carry == 1){
            Node newHead = new Node(1);
            newHead.next = head;
            return newHead;
        }
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node(9);
        Node c = new Node(9); 
        a.next = b;
        b.next = c;
        display(a);
        Node head = add1(a);
        display(head);

        
    }
    
}
