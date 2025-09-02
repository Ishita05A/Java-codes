package Day65;

public class sort012LL {
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static Node sort(Node head){
        Node temp = head;
        Node zeroHead = new Node(-1);
        Node zero = zeroHead;
        Node oneHead = new Node(-1);
        Node one = oneHead;
        Node twoHead = new Node(-1);
        Node two = twoHead;
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
                temp = temp.next;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
                temp = temp.next;
            }
            else if(temp.data == 2){
                two.next = temp;
                two = two.next;
                temp = temp.next;
            }
        }
        two.next = null;
        if(oneHead.next != null){
            zero.next = oneHead.next;
            one.next = twoHead.next;
        }
        else zero.next = twoHead.next;
        if(zeroHead.next != null) return zeroHead.next;
        else if(oneHead.next != null) return oneHead.next;
        else return zeroHead.next;
        
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(0);
        Node d = new Node(0);
        a.next = b;
        b.next = c;
        c.next = d;
        Node head = sort(a);
        display(head);
    }
    
}
