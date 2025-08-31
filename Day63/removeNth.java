package Day63;
public class removeNth {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
         }
    }
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node remove_Nth(Node head,int n){
        if(head == null || head.next == null) return null;
        Node temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
            
        }
        int len = count-n;
        temp = head;
        if(len == 0) return head.next;
        while(len > 1){
            temp = temp.next;
            len--;
        }
        temp.next = temp.next.next;

        return head;
    }
    public static void main(String[] args) {
       Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(9);
        Node e = new Node(0);
        Node f = new Node(9);
        a.next=b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        Node head = remove_Nth(a, 6);
        display(head);

    }

}
