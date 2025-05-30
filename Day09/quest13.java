package Day09;

import java.util.Scanner;

public class quest13 {
    static int largest(int[] arr) {
        int mx = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx)
                mx = arr[i];
        }
        return mx;
    }

    static int secondLargest(int[] arr) {
        int mx = largest(arr);
        int ans = 0;
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != mx) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLargest(arr));
        sc.close();

    }

}
