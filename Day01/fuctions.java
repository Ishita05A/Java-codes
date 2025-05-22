package Day01;
public class fuctions {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertatend(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void insertatbegining(int val){
            Node temp=new Node(val);
            if(head==null){
                tail=temp;
            }
            else{
                temp.next=head;
            }
            head=temp;
            size++;
        }
        void insertat(int idx,int val){
            if(idx==0){
                insertatbegining(val);
                return;
            }
            else if (idx==size()) {
                insertatend(val);
                return;
            }
            size++;

            Node temp=head;
            Node t=new Node(val);
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        void getAt(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);

        }
        void delete(int idx){
            if(idx==0){
                head=head.next;
            }
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        linkedlist ll=new linkedlist();
        ll.insertatend(8);
        ll.insertatend(4);
        ll.insertatbegining(9);
        ll.insertat(2,3);
        ll.getAt(3);
        ll.display();
        System.out.println(ll.size());
        ll.delete(2);
        ll.display();
        System.out.println(ll.size);


    }
    
}
