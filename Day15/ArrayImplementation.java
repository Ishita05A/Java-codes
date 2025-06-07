package Day15;

public class ArrayImplementation {
    public static class Stack {
        int[] arr = new int[5];
        int idx = 0;

        void push(int n) {
            if (idx == arr.length) {
                System.out.println("Stack is full!!");
                return;
            }
            arr[idx] = n;
            idx++;
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is Empty!!");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx - 1];
        }

        boolean isempty() {
            if (idx == 0)
                return true;
            return false;
        }

        int size() {
            return idx;
        }

        boolean isFull() {
            if (idx == arr.length)
                return true;
            return false;
        }

        int isCapacity() {
            return arr.length;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(7);
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.pop());
        st.push(2);
        st.display();
        st.push(6);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.size());
        System.out.println(st.isempty());
        st.push(3);
        st.display();
        st.push(7);
        st.display();
        st.push(6);
        System.out.println(st.isFull());
        System.out.println(st.isCapacity());

    }

}
