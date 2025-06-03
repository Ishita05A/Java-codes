package Day11;

import java.util.Scanner;

public class Query {
    static int[] freq(int[] arr) {
        int[] freqarr = new int[100002];
        for (int i = 0; i < arr.length; i++) {
            freqarr[arr[i]]++;
        }
        return freqarr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freqarr = freq(arr);
        System.out.println("Enter no. of querries");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter no. to be searched");
            num = sc.nextInt();
            if (freqarr[num] > 0) {
                System.out.println("No. is present in arr");
            } else
                System.out.println("Not present");
            q--;
        }
        sc.close();

    }

}
