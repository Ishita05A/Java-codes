package Day34;

import java.util.Scanner;

public class Recursive_BinarySearch {
    static boolean binary_search(int[] arr, int st, int end, int target) {
        if (st > end)
            return false;
        int mid = st + (end - st) / 2;
        if (arr[mid] == target)
            return true;
        else if (arr[mid] > target)
            return (binary_search(arr, st, mid - 1, target));
        else
            return (binary_search(arr, mid + 1, end, target));

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
        System.out.println(binary_search(arr, 0, n - 1, target));
        sc.close();

    }
}
