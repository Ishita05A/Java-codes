package Day57;

public class CircularQueueArray {
    public static class cqa{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        int n = arr.length;
        public void add(int val) throws Exception{
            if(size == n) throw new Exception("Queue is Full");
            if(size == 0){
                front = 0;
                rear = 0;
                arr[0] = val;
            }
            else if(rear<n-1) arr[++rear] =val; 
            else if(rear == n-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
             if(size == 0) throw new Exception("Queue is Empty");
             int x = arr[front];
             if(front == n-1) front = 0;
             else
                front++;
             size--;   
             return x;
        }
        public int peek() throws Exception{
            if(size == 0) throw new Exception("Queue is Empty");
            return arr[front];
        }
        public boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
        public void display(){
            if(size == 0) System.out.println("Queue is Empty");
            else if(rear>=front){
                for(int i = front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else if(rear<front){
                for(int i = front;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        cqa q = new cqa();
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
        for(int i = 0; i<q.arr.length;i++){
            System.out.print(q.arr[i]+" ");
        } 
    }
}
