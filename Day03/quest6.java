package Day03;

public class quest6 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    static Node deleteMiddle(Node head){
        if(head.next==null){
            head=null;
            return head;
        }
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=null && fast.next.next!=null && fast.next.next.next!=null && fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        a=deleteMiddle(a);
        display(a);
        
    }
}
