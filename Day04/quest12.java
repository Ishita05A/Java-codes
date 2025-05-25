package Day04;
public class quest12 {
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
    static Node oddevenLL(Node head){
        Node temp=head;
        Node odd=new Node(0);
        Node even=new Node(0);
        Node tempo=odd;
        Node tempe=even;
        while(temp!=null){
            if(temp.data%2!=0){
                tempo.next=temp;
                tempo=tempo.next;
                
            }
            else{
                tempe.next=temp;
                tempe=tempe.next;
            }
            temp=temp.next;
        }
        tempo.next=even.next;
        return odd.next;
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
        a=oddevenLL(a);
        display(a);
    }
}
