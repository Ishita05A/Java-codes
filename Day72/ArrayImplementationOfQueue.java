package Day72;

public class ArrayImplementationOfQueue {
    public static class queue{
        int[] arr = new int[100];
        int size = 0;
        int front = 0;
        int rear = 0;
        void push(int val){
            if(size == arr.length) return;
            if(size == 0){
                front = 0;
                rear = 0;
                arr[front] = val;  
            }
            else{
                rear++;
                arr[rear] = val;
            }
            size++;
        }
        int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            
                int ans = arr[front];
                front++;
                size--;
                return ans;
        }
        int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
        void display(){
            for(int i =front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        

    }
    public static void main(String[] args) {
        queue q = new queue();
        q.push(5);
        q.push(7);
        q.push(9);
        q.push(4);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.size);
        q.display();        
    }
    
}
