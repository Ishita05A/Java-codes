package Day60;
public class sortlinkedlist {
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static Node findmiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node merge(Node left, Node right){
        Node newHead = new Node(-1);
        Node temp = newHead;
        while(left != null && right != null){
            if(left.data <= right.data){
                temp.next = left;
                temp = left;
                left = left.next;
                
            }
            else{
                temp.next = right;
                temp = right;
                right = right.next;
               
            }
        }
        while(left != null){
            temp.next = left;
            temp = left;
            left = left.next;
            
        }
        while(right != null){
            temp.next = right;
            temp = right;
            right = right.next;
            
        }
        return newHead.next;
    }
    static Node sort(Node head){
    
        if(head == null || head.next == null) return head;
        Node mid = findmiddle(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        left = sort(left);
        right = sort(right);
         return merge(left, right);
        
    }
    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(2);
        Node c = new Node(1);
        Node d = new Node(0);
        Node e = new Node(2);
        Node f = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node head = sort(a);
        display(head);
    }
    
}
