package Day19;

import java.util.Scanner;
import java.util.Stack;

public class quest6B {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] prevGreatest(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        res[0] = -1;
        for (int i = 1; i < arr.length; i++) {
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

    static int[] stockSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = prevGreatest(arr);
        int[] ans = new int[arr.length];
        st.push(0);
        ans[0] = 1;
        for (int i = 1; i < res.length; i++) {
            while (st.size() > 0 && res[i] >= res[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                ans[i] = 1;
                st.push(i);
            } else {
                ans[i] = i - st.peek();
                st.push(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Element");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = stockSpan(arr);
        display(ans);
        sc.close();

    }

}
