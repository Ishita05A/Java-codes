package Day17;

import java.util.Scanner;
import java.util.Stack;

public class quest5B {
    static int[] nextGreatest(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        st.push(arr[n - 1]);
        res[n - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                st.push(arr[i]);
                res[i] = -1;
            } else {
                res[i] = st.peek();
                st.push(arr[i]);

            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = nextGreatest(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }

        sc.close();

    }

}
