package Day45;

import java.util.Scanner;

public class countSort {
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

    static void count_sort(int[] arr) {
        int n = arr.length;
        int max = findMax(arr);
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter no. of elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        count_sort(arr);
        display(arr);
        sc.close();
    }
}
