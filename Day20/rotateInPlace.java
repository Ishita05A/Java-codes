package Day20;

import java.util.Scanner;

public class rotateInPlace {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void rotate(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, k + 1, n - 1);
        reverse(arr, 0, k);
        reverse(arr, 0, n - 1);
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
        rotate(arr, k);
        display(arr);
        sc.close();
    }

}
