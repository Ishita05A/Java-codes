package Day61;

import java.util.Scanner;
import java.util.*;

public class MaxFreqOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for(var e : arr){
            if(!mp.containsKey(e)) mp.put(e, 1);
            else mp.put(e,mp.get(e)+1);
        }
        int max = Integer.MIN_VALUE;
        for(var e : arr){
            if(mp.get(e)> max){
                max = mp.get(e);
            }
        }
        System.out.println(mp);
        System.out.println(max);
        sc.close();
    }
    
}
