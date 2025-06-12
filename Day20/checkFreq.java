package Day20;

import java.util.Scanner;

public class checkFreq {
    static int[] freqArr(int[] arr) {
        int[] freq = new int[100001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    static void isPresent(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of queries");
        int q = sc.nextInt();
        int[] freq = freqArr(arr);
        while (q > 0) {
            int x = sc.nextInt();
            if (freq[x] > 0)
                System.out.println("true");
            else
                System.out.println("false");
            q--;
        }
        sc.close();

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
        isPresent(arr);
        sc.close();

    }

}
