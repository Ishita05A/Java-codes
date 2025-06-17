package Day25;

import java.util.Scanner;

public class recursion_1toN {
    static void recursion(int n) {
        if (n == 0)
            return;
        recursion(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        recursion(n);
        sc.close();

    }

}
