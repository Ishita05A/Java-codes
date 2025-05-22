package Day01;
public class quest1 {
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
    static void deleteNode(Node val){
        
        val.data=val.next.data;
        val.next=val.next.next;
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        deleteNode(b);
        display(a);

    }
}
