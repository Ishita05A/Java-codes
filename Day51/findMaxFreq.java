package Day51;

import java.util.Scanner;
import java.util.*;

public class findMaxFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for (var e : arr) {
            if (!mp.containsKey(e))
                mp.put(e, 1);
            else
                mp.put(e, mp.get(e) + 1);
        }
        System.out.println(mp.entrySet());
        int maxfreq = -1;
        int ansKey = -1;
        for (var e : mp.entrySet()) {
            if (maxfreq < e.getValue()) {
                maxfreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.printf("Key with max freq is %d with %d frequency", ansKey, maxfreq);
        sc.close();
    }
}
