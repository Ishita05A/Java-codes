package Day68;



public class add2LL {
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
    static Node add2(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummNode = new Node(-1);
        Node temp = dummNode;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int sum = carry;
            if(temp1 != null){
                 sum+=temp1.data;
                 temp1 = temp1.next;
            }
            if(temp2 != null){
                sum+=temp2.data;
                temp2 = temp2.next;
            }
            Node curr = new Node(sum%10);
            temp.next = curr;
            temp = temp.next;
            carry = sum/10;
            
        } 
        if(carry >0){
            Node curr = new Node(carry);
            temp.next = curr;
        }
        return dummNode.next;
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(3);
        Node u = new Node(5);
        Node v = new Node(6);
        Node w = new Node(4);
        a.next = b;
        b.next = c;
        u.next = v;
        v.next = w;
        Node head = add2(a, u);
        display(a);
        display(u);
        display(head);
    }
    
}
