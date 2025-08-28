package Day62;

public class detectloop {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
         }
    }
    static boolean hasLoop(Node head){
        Node slow = head;
        Node fast = head;
        if(fast == null) return true;
        if(fast.next == null) return true;
        if(fast.next.next == null) return true;

        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
       Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(9);
        Node e = new Node(9);
        Node f = new Node(9);
        a.next=b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        d.next=b;
        System.out.println(hasLoop(d));

    }
    
}
