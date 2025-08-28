package Day62;

public class findstartingpoint {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
         }
    }
    static Node stPoint(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                    if(slow == fast) return slow;
                }
            }
        }
        return null;
       


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
        System.out.println(stPoint(a).data);
    }
}
