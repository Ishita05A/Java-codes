package Day32;

import java.util.Scanner;

public class quest5 {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void count_sort(int[] arr) {
        int n = arr.length;
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count_0++;
            if (arr[i] == 1)
                count_1++;
            if (arr[i] == 2)
                count_2++;
        }
        int k = 0;
        while (count_0 != 0) {
            arr[k++] = 0;
            count_0--;
        }
        while (count_1 != 0) {
            arr[k++] = 1;
            count_1--;
        }
        while (count_2 != 0) {
            arr[k++] = 2;
            count_2--;
        }
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
        count_sort(arr);
        display(arr);
        sc.close();

    }

}
