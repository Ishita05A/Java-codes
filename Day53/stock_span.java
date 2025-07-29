package Day53;

import java.util.Scanner;
import java.util.Stack;

public class stock_span {
    static int[] stockSpan(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        res[0] = 1;
        st.push(0);
        
        for(int i = 1;i<n; i++){
            while(st.size()>0 && arr[st.peek()]<arr[i]){
                st.pop();
            } 
            if(st.size() == 0) res[i] = 1;
            else if(arr[st.peek()]>arr[i]) res[i] = i-st.peek();
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = stockSpan(arr);
        for(int i = 0; i<n;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();

    }
    
}
