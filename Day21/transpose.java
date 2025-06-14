package Day21;

import java.util.Scanner;

public class transpose {
    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no . of rows and column");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        transposeMatrix(arr, n);
        display(arr);
        sc.close();
    }

}
