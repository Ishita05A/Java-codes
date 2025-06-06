package Day05;

public class quest17 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    static int maxtwinsum(Node head){
        int max=Integer.MIN_VALUE;
        Node slow=head;
        Node fast=head;
        Node p1=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        Node p2=slow.next;
        while(p1!=slow.next){
            int sum=p1.data+p2.data;
            if(sum>max){
                max=sum;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return max;

    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(5);
        Node e=new Node(3);
        Node f=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e; 
        e.next=f;
        System.out.println(maxtwinsum(a));
    }
    
}
