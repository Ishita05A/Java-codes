package Day01;
public class ReveseLLRecursively{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void reverseLL(Node temp){
        if(temp==null){
            return;
        }
        reverseLL(temp.next);
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        reverseLL(a);
    }
    
}
