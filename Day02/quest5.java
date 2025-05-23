//RIGHT Middle for even 
package Day02;
public class quest5 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node middleNode(Node head){
        
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(middleNode(a).data);
    }
    
}
