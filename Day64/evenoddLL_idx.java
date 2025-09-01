package Day64;


public class evenoddLL_idx {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data  =data;
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


    static Node sort(Node head){
        Node temp = head;
        Node evenHead = new Node(-1);
        Node even = evenHead;
        Node oddHead = new Node(-1);
        Node odd = oddHead;
        int c = 1;
        while(temp != null){
            if(c%2 == 1){
                odd.next = temp;
                temp = temp.next;
                odd = odd.next;
                c++;
            }
            else{
                even.next = temp;
                even =  even.next;
                temp = temp.next;
                c++;
            }
        }
        odd.next = evenHead.next;
        return oddHead.next;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(9);
        Node d = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
        Node head = sort(a);
        display(head);



    }
}
