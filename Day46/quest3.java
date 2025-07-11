package Day46;

import java.util.Scanner;

public class quest3 {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static void countSort(int[] arr) {
        int n = arr.length;
        int max = findMax(arr);
        int[] output = new int[n];
        int[] freq = new int[max + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int idx = freq[arr[i]] - 1;
            output[idx] = arr[i];
            freq[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countSort(arr);
        display(arr);
        sc.close();

    }

}
