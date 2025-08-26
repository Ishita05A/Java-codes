package Day61;

// import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class Freqofarray {
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
        for( var e: arr){
            if(!mp.containsKey(e)){
                mp.put(e, 1);
            }
            else{
                mp.put(e, mp.get(e)+1);
            }
        }
        System.out.println(mp);
        sc.close();

    }
}
