package Day72;

public class CircularArrayImplementaion {
    public static class queue {
        int front = 0;
        int rear = 0;
        int[] arr = new int[5];
        int n = arr.length;
        int size = 0;

        void push(int val) {
            if (size == arr.length) {
                System.out.println("Queue is Full !!");
                return;
            }
            if (size == 0) {
                front = 0;
                rear = 0;
                arr[front] = val;
            } else if (rear == n - 1) {
                rear = 0;
                arr[rear] = val;
            } else {
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
            if(front == n-1){
                int ans = arr[front];
                front = 0;
                size--;
                return ans;
            }
            int ans = arr[front];
            front++;
            size--;
            return ans;
        }
        int peek(){
            if(size == 0){
                System.out.println("Queue is Full");
                return -1;
            }
            return arr[front];
        }
        void display(){
            if(rear<front){
                for(int i = front; i<n; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i = front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
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
        q.remove();
        q.remove();
        q.remove();
        q.push(5);
        q.push(7);
        q.push(9);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.size);
        q.display();
    }

}
