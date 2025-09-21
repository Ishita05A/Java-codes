package Day79;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int partner = target -arr[i];
            if(mp.containsKey(partner)) return new int[]{i,mp.get(partner)};
            else mp.put(arr[i], i);
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
