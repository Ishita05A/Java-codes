package Day77;

import java.util.Scanner;

public class FindMultiple {
    static void printMultiple(int n, int k) {
        if (k == 0)
            return;
        printMultiple(n, k - 1);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        System.out.println("Enter times");
        int k = sc.nextInt();
        printMultiple(n, k);
        sc.close();
    }

}
