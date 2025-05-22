package Day01;
public class LinkedListbasics {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        Node temp =a;
        for(int i=1;i<=4;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        temp=a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}