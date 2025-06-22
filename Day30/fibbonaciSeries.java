package Day30;

import java.util.Scanner;

public class fibbonaciSeries {
    static int fibbo_series(int n) {
        if (n == 0 || n == 1)
            return n;
        return (fibbo_series(n - 1) + fibbo_series(n - 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibbo_series(i) + " ");
        }
        sc.close();
    }

}
