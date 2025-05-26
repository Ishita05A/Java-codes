package Day05;

public class quest15 {
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static Node reverseLL(Node head){
        Node prev=null;
        Node after=null;
        Node curr=head;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        Node e=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        a=reverseLL(a);
        display(a);
    }
    
}
