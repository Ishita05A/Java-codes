package Day21;

import java.util.Scanner;

public class PartitionArray {
    static int[] prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + arr[i - 1];
        }
        return prefix;
    }

    static boolean partition(int[] arr) {
        int prefixsum = 0;
        int sum = 0;
        for (int k = 0; k < arr.length; k++) {
            sum += arr[k];
        }
        for (int i = 0; i < arr.length; i++) {
            prefixsum += arr[i];
            int suffixsum = sum - prefixsum;
            if (prefixsum == suffixsum)
                return true;

        }
        return false;
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
        System.out.println(partition(arr));
        sc.close();
    }

}
