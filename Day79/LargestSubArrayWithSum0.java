 package Day79;

import java.util.HashMap;
import java.util.Scanner;

class LargestSubArrayWithSum0 {
    static int findSum(int[] arr){
        int prefixSum = 0;
        int max = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0, -1);
        for(int i = 0;i<arr.length;i++){
            prefixSum+=arr[i];
            if(!mp.containsKey(prefixSum)){
                mp.put(prefixSum, i);
            }
            else{
                int ans = i-mp.get(prefixSum);
                if(ans>max) max = ans;
            }
        }
        return max;
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
       System.out.println(findSum(arr));
       sc.close();

    }
    
}