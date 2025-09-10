package Day71;

import java.util.Scanner;

public class firstAndLastOccurance {
    static int lowerBound(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int lb = arr.length;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] >= target) {
                lb = mid;
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return lb; 
   }
   static int upperBound(int[] arr, int target){
        int st = 0;
        int end = arr.length-1;
        int ub = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid]>target){
                ub = mid;
                end = mid -1;
            }
            else{
                st = mid + 1;
            }
        }
        return ub;

   }

    

    static int[] firstAndlastOccurance(int[] arr, int target) {
        int n = arr.length;
        
        int lb = lowerBound(arr, target);
        if(lb == n || arr[lb] != target) return new int[]{-1 , -1};
        return new int[]{lb , upperBound(arr, target)-1};
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
        int target = sc.nextInt();
        int[] ans = firstAndlastOccurance(arr, target);
        for(int i = 0; i<ans.length ; i++){
            System.out.println(ans[i]+" ");
        }
        sc.close();
    }
}
