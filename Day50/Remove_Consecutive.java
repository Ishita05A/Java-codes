package Day50;

import java.util.Scanner;

import java.util.Stack;

public class Remove_Consecutive {
    static int[] remove_Consecutive(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0 || st.peek() != arr[i])
                st.push(arr[i]);

            else if (st.peek() == arr[i] && i < arr.length - 1) {
                if (arr[i] != arr[i + 1])
                    st.pop();
            } else
                st.pop();
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.peek();
            st.pop();
        }
        return ans;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = remove_Consecutive(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();

    }

}
