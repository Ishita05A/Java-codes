package Day03;

public class quest8 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node LLcycleNode(Node head){
        Node temp=head;
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        while(temp!=slow){
            temp=temp.next;
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
        d.next=b;
        System.out.println(LLcycleNode(a).data);
    }
}
