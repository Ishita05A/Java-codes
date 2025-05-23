package Day02;

public class quest4 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node intersectingNode(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        int m=0;
        int n=0;
        while(temp1.next!=null){
            m++;
            temp1=temp1.next;
        }
        while(temp2.next!=null){
            n++;
            temp2=temp2.next;
        }
        if(m>n){
            for(int i=1;i<=m-n;i++){
                head1=head1.next;
            }
        }
        else{
            for(int i=1;i<=n-m;i++){
                head2=head2.next;
            }
        }
        while(head1.next!=head2.next){
            head1=head1.next;
            head2=head2.next;
        }
        return(head1.next);
    }
    public static void main(String[] args) {
        Node a=new Node(300);
        Node b=new Node(400);
        Node c=new Node(500);
        Node d=new Node(600);
        Node e=new Node(700);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node f=new Node(800);
        Node g=new Node(600);
        f.next=g;
        g.next=d;
        d.next=e;
        Node ans=intersectingNode(a, f);
        System.out.println(ans.data);

    }
}
