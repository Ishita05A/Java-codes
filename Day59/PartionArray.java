package Day59;

import java.util.Scanner;

public class PartionArray {
    static boolean partion_Array(int[] arr){
        int sum = arr[0];
        for(int i = 1; i<arr.length;i++){
            sum+=arr[i];
            arr[i]+=arr[i-1];
        }
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i] == sum-arr[i]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(partion_Array(arr));
        sc.close();
    }
    
}
