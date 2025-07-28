package Day52;

import java.util.Scanner;
import java.util.Stack;

public class removeSubsequent {
    static int[] remove(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length-1;i++){
            if(st.isEmpty()) st.push(arr[i]);
            else if(st.peek() == arr[i]){
                if(i==n-1 || arr[i]!=arr[i-1]) st.pop();
            }
            else st.push(arr[i]);
        } 
        int m = st.size();
        int[] ans = new int[m];
        for(int i = m-1; i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = remove(arr);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
    
}
