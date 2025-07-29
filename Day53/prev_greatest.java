package Day53;

import java.util.Scanner;
import java.util.Stack;

public class prev_greatest {
    static int[] prev_Greatest(int[] arr){
        int n= arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        int[] res = new int[n];
        res[0] = -1;
        for(int i = 0; i<n; i++){
            res[i] = -1;
            while(st.peek() < arr[i]) st.pop();
            if (st.size()==0) res[i] = -1;
            else if(st.peek()>arr[i]) res[i] = st.peek();
            st.push(arr[i]);

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = prev_Greatest(arr);
        for(int i = 0; i<n;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
    
}
