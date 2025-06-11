package Revision.Stack;

import java.util.Scanner;
import java.util.Stack;

public class quest4 {
    static int[] subConsequetive(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (arr[i] == st.peek() && i < arr.length - 1) {
                if (arr[i] != arr[i + 1])
                    st.pop();
            } else
                st.pop();
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ENter eleemnts");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = subConsequetive(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();

    }

}
