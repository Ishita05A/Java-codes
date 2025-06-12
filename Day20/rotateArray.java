package Day20;

import java.util.Scanner;

public class rotateArray {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        int j = 0;
        int[] res = new int[n];
        k = k % n;
        for (int i = k + 1; i < arr.length; i++) {
            res[j++] = arr[i];
        }
        for (int i = 0; i <= k; i++) {
            res[j++] = arr[i];
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no. of times to rotate");
        int k = sc.nextInt();
        int[] ans = rotate(arr, k);
        display(ans);
        sc.close();
    }

}
