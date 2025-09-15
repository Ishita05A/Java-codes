

import java.util.Scanner;

public class CountOccurance {
    static int lowerBound(int[] arr,int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int idx = n;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(arr[mid] < target){
                st = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid] == target){
                idx = mid;
                end = mid-1;
            }
        }
        return idx;
    }
    
    static int upperBound(int[] arr,int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int idx = n;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(arr[mid]<target){
                st = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid] == target){
                idx = mid;
                st = mid+1;
            }
        }
        return idx;
    }
    static int findOccurance(int[] arr,int target){
        int n = arr.length;
        int lb = lowerBound(arr, target);
        if(lb == n || arr[lb] != target ) return -1;
        int ub = upperBound(arr, target);
        return  ub-lb+1;

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
        int ans = findOccurance(arr, target);
        
        System.out.println(ans);
        sc.close();
    }
}
