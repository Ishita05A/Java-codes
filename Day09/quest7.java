package Day09;

import java.util.Scanner;

public class quest7 {
    static int[] smallestAndLargest(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        int[] ans = { max, min };
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = smallestAndLargest(arr);
        System.out.println("Max = " + ans[0]);
        System.out.println("Min = " + ans[1]);
        sc.close();

    }

}
