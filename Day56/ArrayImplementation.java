package Day56;

public class ArrayImplementation {
    public static class queueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];
        int n = arr.length;
        void add(int val){
            if(r== n-1){
                System.out.println("Queue is Full!!");
                return;
            }
            if(size == 0){
                arr[0] = val;
                f = 0;
                r = 0;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            f++;
            size --;
            return arr[f-1];
        }
        int peek(){
            if(size == 0){
                System.out.println("Queue is empty !!");
                return -1;
            }
            return arr[f];
        }
        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
        void display(){
            if(size == 0) System.out.println("Queue is Empty");
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(4);
        
        System.out.println(q.remove());
        System.out.println(q.remove());
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
