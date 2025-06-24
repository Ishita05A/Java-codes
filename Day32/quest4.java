package Day32;

import java.util.Scanner;

public class quest4 {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int st, int end) {

        int pivot = arr[st];
        int count = 0;
        for (int i = st; i < end; i++) {
            if (arr[i] <= pivot)
                count++;
        }
        int pi = count + st;
        swap(arr, pi, st);
        pivot = arr[pi];
        int i = st;
        int j = end;
        while (i < pi && j > pi) {
            if (arr[i] < pivot)
                i++;
            if (arr[j] > pivot)
                j--;
            if (arr[i] > pivot && arr[j] < pivot) {
                swap(arr, i, j);
                i++;
                j--;
            }

        }
        return pi;
    }

    static void sort(int[] arr, int st, int end) {
        if (st >= end)
            return;

        int pi = partition(arr, st, end);
        sort(arr, st, pi - 1);
        sort(arr, pi + 1, end);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr, 0, n - 1);
        display(arr);
        sc.close();

    }

}
