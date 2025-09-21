package Day79;

import java.util.Scanner;

public class TwoSumBruteForce {
    static int[] twoSum(int[] arr,int target){
        for(int i  = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
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
        System.out.println("Enter Target");
        int x = sc.nextInt();
        int[] ans = twoSum(arr, x);
        System.out.printf("%d %d",ans[0],ans[1]);
        sc.close();



    }
    
}
