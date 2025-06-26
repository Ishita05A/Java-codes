package Day34;

import java.util.Scanner;

public class Binary_Search {
    static void binary_search(int[] arr, int target) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int idx = -1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == target) {
                idx = mid;
                System.out.println("Elements found at Index " + idx);
                return;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target)
                st = mid + 1;
        }
        if (idx == -1)
            System.out.println("Element not found");
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
        binary_search(arr, target);
        sc.close();

    }

}
