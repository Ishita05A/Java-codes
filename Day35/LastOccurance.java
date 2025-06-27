package Day35;

import java.util.Scanner;

public class LastOccurance {
    static int last_occurance(int[] arr, int target) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                ans = mid;
                st = mid + 1;
            } else if (arr[mid] > target)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();
        System.out.println(last_occurance(arr, target));
        sc.close();

    }

}
