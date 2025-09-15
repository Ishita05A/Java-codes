

import java.util.Scanner;

public class FindInsertPosition {
    static int insertPosition(int[] arr,int target){
        int n =arr.length;
        int idx = -1;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(arr[mid] >= target){
                idx = mid;
                end = mid-1;
            }
            else st = mid+1;
        }
        return idx;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        System.out.println(insertPosition(arr, target));
        sc.close();
    }
    
}
