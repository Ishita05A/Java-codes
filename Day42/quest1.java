package Day42;

import java.util.Scanner;

public class quest1 {
    static int binary_search(int[] arr, int target) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                st = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of element");
        int n = sc.nextInt();

        System.out.println("Enter Elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();
        System.out.println(binary_search(arr, target));
        sc.close();

    }

}
