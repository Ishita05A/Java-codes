package Day21;

import java.util.Scanner;

public class SquareOfArray {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] square(int[] arr) {
        int[] ans = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int k = arr.length - 1;
        while (i <= j) {
            int left = arr[i] * arr[i];
            int right = arr[j] * arr[j];
            if (left > right) {
                ans[k--] = left;
                i++;
            } else {
                ans[k--] = right;
                j--;
            }
        }
        return ans;
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
        display(square(arr));
        sc.close();
    }

}
