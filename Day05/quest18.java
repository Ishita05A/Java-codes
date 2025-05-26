package Day05;

public class quest18 {
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
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static Node oddevenLL(Node head){
        Node temp=head;
    
        Node tempe=new Node(0);
        Node even=tempe;
        Node tempo=new Node(0);
        Node odd=tempo;
        while(temp!=null){
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;
            if(temp==null){
                break;
            }
            tempe.next=temp;
            temp=temp.next;
            tempe=tempe.next;
        }
        odd=odd.next;
        even=even.next;
        tempo.next=even;
        return head;
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
        a=oddevenLL(a);
        display(a);
    }
    
}
