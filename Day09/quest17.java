package Day09;

import java.util.Scanner;

public class quest17 {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] rotate(int[] arr, int k) {
        int j = 0;
        k = arr.length % k;
        int[] ans = new int[arr.length];
        for (int i = k + 2; i < arr.length; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i <= k + 1; i++) {
            ans[j++] = arr[i];
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
        display(rotate(arr, 2));
        sc.close();
    }

}
