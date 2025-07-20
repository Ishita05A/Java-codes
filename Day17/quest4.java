package Day17;

import java.util.Scanner;
import java.util.Stack;

public class quest4 {
    static int[] subsequence(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0 || st.peek() != arr[i])
                st.push(arr[i]);
            else if (arr[i] == st.peek() && i < arr.length - 1) {
                if (arr[i] != arr[i + 1]) {
                    st.pop();
                }
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
        System.out.println();
        int[] arr = new int[n];
        System.out.println("Enter Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = subsequence(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
