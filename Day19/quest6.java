package Day19;

import java.util.Scanner;
import java.util.Stack;

public class quest6 {
    static int[] prevGreatest(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        res[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() != 0 && st.peek() < arr[i]) {
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
        System.out.println("Enter no. of Element");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = prevGreatest(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();

    }

}
