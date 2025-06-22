package Day30;

import java.util.Scanner;

public class nthFibbonacci {
    static int fibbo_nth_term(int n) {
        if (n == 0 || n == 1)
            return n;
        return (fibbo_nth_term(n - 1) + fibbo_nth_term(n - 2));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth number");
        int n = sc.nextInt();
        System.out.println(fibbo_nth_term(n));
        sc.close();
    }

}
