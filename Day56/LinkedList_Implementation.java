package Day56;

public class LinkedList_Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = tail.next;
            }
            size++;
        }
        int remove(){
            if(size == 0){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            if(size == 0) tail = null;
            return x;
        }
        int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
        void display(){
            if(size == 0) System.out.println("Queue is Empty");
            else{
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(0);
        q.add(4);
        q.add(6);
        q.add(9);
        System.out.println(q.peek());
        q.display();
        System.out.println(q.remove());
        System.out.println(q.size);
        
    }
    
}
