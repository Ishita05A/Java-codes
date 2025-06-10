package Revision.Matrix;

import java.util.Scanner;

public class quest2 {
    static int[] spiral(int[][] arr, int n) {
        int[] num = new int[n * n];
        int c = 0;
        int tr = 0, br = n - 1, lc = 0, rc = n - 1;
        while (c < n * n) {
            for (int i = lc; i <= rc && c < n * n; i++) {
                num[c++] = arr[tr][i];
            }
            tr++;
            for (int j = tr; j <= br && c < n * n; j++) {
                num[c++] = arr[j][rc];

            }
            rc--;
            for (int i = rc; i >= lc && c < n * n; i--) {
                num[c++] = arr[br][i];
            }
            br--;
            for (int i = br; i >= tr && c < n * n; i--) {
                num[c++] = arr[i][lc];
            }
            lc++;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] ans = spiral(arr, n);
        for (int i = 0; i < n * n; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }

}
