package Day03;

public class quest7{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static boolean isLLcycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;


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
        System.out.println(isLLcycle(a));
    }
}
