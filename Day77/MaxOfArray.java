package Day77;

import java.util.Scanner;

public class MaxOfArray {
    static int findMax(int[] arr,int idx){
        if(idx == arr.length-1) return arr[idx];
        int max = findMax(arr, idx+1);
        if(arr[idx] > max) max = arr[idx];
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr, 0));
        sc.close();
    }
    
}
