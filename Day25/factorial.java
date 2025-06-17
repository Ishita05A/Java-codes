package Day25;

import java.util.Scanner;

public class factorial {
    static int fact(int n) {
        if (n == 1)
            return n;
        return (n * fact(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();

    }

}
