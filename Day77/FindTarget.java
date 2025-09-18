package Day77;

import java.util.Scanner;

public class FindTarget {
    static void isPresent(int[] arr,int target,int idx){
        if(idx == arr.length){
            System.out.println("Not Found");
            return;
        }
        if(arr[idx] == target){
            System.out.println("Found");
            return;
        }
        isPresent(arr, target, idx+1);

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
        isPresent(arr, x, 0);
        sc.close();
    }
    
}
