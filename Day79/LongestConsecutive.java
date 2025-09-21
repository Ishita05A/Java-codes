package Day79;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutive {
    static int longest_Consecutive(int[] nums){
        HashSet<Integer> mp = new HashSet<>();
        for(int num : nums){
            mp.add(num);
        }
        
        int currNum = 0;
        int max = 0;
        for(int num : mp){
            if(!mp.contains(num-1)){
                currNum = num;
                int currStreak = 1;
                while(mp.contains(currNum+1)){
                    currNum++;
                    currStreak++;
                }
                max = Math.max(currStreak, max);
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
        System.out.println(longest_Consecutive(arr));
        sc.close();
    }
    
}
