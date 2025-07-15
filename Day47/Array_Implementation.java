package Day47;

public class Array_Implementation {
    public static class Stack {
        int[] arr = new int[5];
        int idx = 0;

        void push(int x) {
            if (idx == arr.length) {
                System.out.println("Stack is Empty");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            if (idx == 0)
                return true;
            return false;
        }

        boolean isFull() {
            if (idx == arr.length)
                return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(7);
        st.push(2);
        st.push(9);
        st.push(3);
        st.display();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.size());
        st.push(8);
        st.push(2);
        st.display();
        st.push(3);
        st.push(2);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }

}
