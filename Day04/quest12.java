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
        Node tempo=head;
        Node tempe=head;
        Node temp=new Node(100);
        Node ans=temp;
        while(tempe.data%2!=0){
            tempe=tempe.next;
        }
        Node evenans=tempe;
        Node even=tempe;
        tempe=temp.next;
        while(tempo.next!=null){
            if(tempo.data%2!=0){
                temp.next=tempo;
                temp=temp.next;
                tempo=tempo.next;

            }
            // else if(tempe.data%2==0){
            //     even.next=tempe;
            //     tempe=tempe.next;
                
            // }
        }
        temp.next=evenans;
        
        return ans.next;
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
