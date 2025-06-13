package Day21;

import java.util.Scanner;

public class SumOfRange {
    static int rangeSum(int[] arr, int r) {
        int sum = 0;
        for (int i = 0; i < r; i++) {
            sum += arr[i];
        }
        return sum;
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
        System.out.println("Enter range for sum");
        int x = sc.nextInt();
        System.out.println(rangeSum(arr, x));
        sc.close();

    }

}
