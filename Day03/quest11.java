package Day03;

public class quest11 {
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
    static Node mergeSortedLL(Node h1,Node h2){
        Node t1=h1;
        Node t2=h2;
        Node t=new Node(100);
        Node h=t;
        while(t1!=null && t2!=null){
            if(t1.data<t2.data){
                t.next=t1;
                t=t.next;
                t1=t1.next;
            }
            else{
                t.next=t2;
                t=t.next;
                t2=t2.next;
            }
            
        }
        if(t1==null){
            t.next=t2;
        }
        else{
            t.next=t1;
        }
        return h.next;
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
        display(mergeSortedLL(a, e));
    }
    
}
