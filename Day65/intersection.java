package Day65;


public class intersection{
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static Node find_Intersection(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp2 != null ){
            temp1 = head1;
            while(temp1 != null){
                if(temp1 == temp2) return temp1;
                temp1 = temp1.next;
            }
            
            temp2= temp2.next;
        }
        return null;
    }
    public static void main(String[] args) {

        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(4);
        Node d = new Node(6);
        Node e = new Node(7);
        Node w = new Node(0);
        Node x = new Node(0);
        Node y = new Node(0);
       
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        w.next = x;
        x.next = y;
        y.next = c;

        Node int_Point = find_Intersection(a, w);
        System.out.println(int_Point.data);

    }
}