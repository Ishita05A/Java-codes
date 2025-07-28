package Day52;

import java.util.Scanner;
import java.util.Stack;

public class nextGreatest {
    static int[] next_Greatest(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        
        int[] res = new int[n];
        res[n-1] = -1;
        for(int i = n-2; i>=0; i--){
            res[i] = -1;
           while(st.size()>0 && st.peek()<arr[i]) st.pop();
           if(st.size()==0) res[i] = -1;
           else res[i] = st.peek();
           st.push(arr[i]);
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no .of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] =sc.nextInt();
        }
        int[] res = next_Greatest(arr);
        for(int i = 0; i<n; i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
    
}
