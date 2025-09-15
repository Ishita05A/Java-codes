package Day75;

import java.util.Scanner;

public class isPresentInRotatedSortedArray {
    static boolean isPresent(int[] arr, int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(arr[mid] == target) return true;
            
            else if(arr[st] == arr[mid] && arr[mid] == arr[end]){
                st++;
                end--;
            }
            else if(arr[st] <= arr[mid]){
                if(arr[st] <= target && target < arr[mid]) end = mid -1;
                else st = mid +1;
            }
            else{
                if(arr[mid] < target && target <= arr[end]) st = mid +1;
                else end = mid -1;
            }
        }
        return false;
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
        System.out.println(isPresent(arr, target));
        sc.close();
    
    }
    
}
