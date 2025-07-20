package Revision.Pattern;

import java.util.Scanner;

public class quest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("Enter columns");
        int m = sc.nextInt();
        // int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();

    }

}
