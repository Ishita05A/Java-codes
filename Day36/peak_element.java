package Day36;

import java.util.Scanner;

public class peak_element {
    static int find_peak_element(int[] arr) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < arr[mid + 1]) {
                ans = mid + 1;
                st = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(find_peak_element(arr));
        sc.close();
    }

}
