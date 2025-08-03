package Day57;

public class CircularQueueLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class cqll{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            tail.next = head;
            size++;
        }
        public int remove() throws Exception{
            if(head == null) throw new Exception("Queue is Empty");
            Node temp = head;
            head = head.next;
            tail.next = head;
            size--;
            if(size == 0){
                head = null;
                tail = null;
            }
            return temp.data;
        }
        public int peek() throws Exception{
            if(head == null) throw new Exception("Queue is Empty");
            return head.data;
        }
        public boolean isEmpty(){
            if(size == 0 ) return true;
            return false;
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            do{
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            while(temp!= head);
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
        cqll q = new cqll();
        q.display();

        q.add(4);
        q.add(6);
        q.add(7);
        q.add(3);
        q.add(0);
        q.display();
        q.remove();
        q.remove();
        q.add(3);
        q.add(9);
        q.display();
    }
}
