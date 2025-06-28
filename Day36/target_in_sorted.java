package Day36;

import java.util.Scanner;

public class target_in_sorted {
    static int find(int[] arr, int target) {
        int n = arr.length - 1;
        int st = 0;
        int end = n - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < arr[end]) {
                if (arr[mid] < target && arr[end] >= target)
                    st = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (target <= arr[st] && target > arr[mid])
                    end = mid - 1;
                else
                    st = mid + 1;
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
        System.out.println("Enter target element");
        int target = sc.nextInt();
        System.out.println(find(arr, target));
        sc.close();
    }

}
