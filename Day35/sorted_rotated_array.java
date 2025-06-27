package Day35;

import java.util.Scanner;

public class sorted_rotated_array {
    static int search_minimum(int[] arr) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > arr[n - 1])
                st = mid + 1;
            else if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                end = mid - 1;
            }
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
        System.out.println(search_minimum(arr));
        sc.close();
    }

}
