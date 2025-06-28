package Day36;

import java.util.Scanner;

public class multiple_peak_element {
    static int find_peak_element(int[] arr) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if ((mid == n - 1 || arr[mid] > arr[mid + 1]) && (mid == 0 || arr[mid] > arr[mid - 1])) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1])
                st = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
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
