package Day77;

import java.util.Scanner;

public class AllTargetIndices {
    static void printIndices(int[] arr,int idx,int target){
        if(idx == arr.length) return;
        if(arr[idx] == target) System.out.print(idx+" ");
        printIndices(arr, idx+1, target);
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
        System.out.println("Enter Target");
        int x = sc.nextInt();
        printIndices(arr, 0, x);
        sc.close();
    
    }
    
}
