package Revision.Pattern;

import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows ");
        int n = sc.nextInt();
        System.out.println("Enter columns");
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print("*" + " ");
            }
            System.out.println();

        }
        sc.close();

    }

}
