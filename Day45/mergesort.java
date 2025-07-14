package Day45;

import java.util.Scanner;

public class mergesort {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void merge(int[] arr, int st, int end, int mid) {
        int n1 = mid - st + 1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[st + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = st;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else if (right[j] < left[i])
                arr[k++] = right[j++];
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }

    }

    static void merge_sort(int[] arr, int st, int end) {
        int mid = st + (end - st) / 2;
        if (st >= end)
            return;
        merge_sort(arr, st, mid);
        merge_sort(arr, mid + 1, end);
        merge(arr, st, end, mid);
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
        merge_sort(arr, 0, n - 1);
        display(arr);
        sc.close();
    }

}
