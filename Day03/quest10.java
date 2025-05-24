package Day03;

public class quest10 {
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
    static Node MergeLL(Node head1, Node head2){
        Node temp1=head1;
        Node temp2=head2;
        Node temp=new Node(100);
        Node head=temp;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return head.next;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(3);
        Node c=new Node(5);
        Node d=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        Node e=new Node(2);
        Node f=new Node(4);
        Node g=new Node(6);
        Node h=new Node(8);
        Node i=new Node(10);
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        display(MergeLL(a,e));
    }
    
}
