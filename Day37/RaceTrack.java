package Day37;

import java.util.Scanner;

public class RaceTrack {
    static boolean isPossible(int[] arr, int k, int dist) {
        int kidplaced = 1;
        int lastKid = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastKid >= dist) {
                kidplaced++;
                lastKid = arr[i];
            }
        }
        return kidplaced >= k;

    }

    static int race_track(int[] arr, int k) {
        if (k > arr.length)
            return -1;
        int st = 0;
        int end = (int) 1e9;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isPossible(arr, k, mid)) {
                ans = mid;
                st = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no. of students");
        int k = sc.nextInt();
        System.out.println(race_track(arr, k));
        sc.close();

    }

}
