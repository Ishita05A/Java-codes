package Day01;

public class quest2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static int count(Node temp){
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    static int nthvalue(int n,Node temp){
        int m=count(temp);
        for(int i=1;i<m-n+1;i++){
            temp=temp.next;
        }
        return(temp.data);
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(nthvalue(3, a));
    }
    
}
