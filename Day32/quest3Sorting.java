package Day32;

import java.util.Scanner;

public class quest3Sorting {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sorting(int[] arr) {
        if (arr.length <= 1)
            return;
        int x = -1;
        int y = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                } else
                    y = i;
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

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
        sorting(arr);
        display(arr);
        sc.close();
    }

}
