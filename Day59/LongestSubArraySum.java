package Day59;

import java.util.Scanner;

public class LongestSubArraySum {
    static int subArraySum(int[] arr, int target){
        int max = 0;
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            int count = 0;
            int j = i;
            while(sum != target){
                sum+=arr[j];
                j++;
                count++;
            }
            if(count>max) max = count;
        }
        return max;

    }
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
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
        System.out.println("Enter target sum");
        int x = sc.nextInt();
        System.out.println(subArraySum(arr, x));
        sc.close();
    }
    
}
