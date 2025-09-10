package Day71;

import java.util.Scanner;

public class firstOccurance {
    static int findOccurance(int[] arr, int target) {
        int st = 0;
        int idx = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < target) {
                st = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                idx = mid;
                end = mid - 1;
            }
        }
        return idx;
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
        System.out.println(findOccurance(arr, target));
        sc.close();

    }
}
