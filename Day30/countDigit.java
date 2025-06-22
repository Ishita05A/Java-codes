package Day30;

import java.util.Scanner;

public class countDigit {
    static int digit_count(int n) {
        if (n > 0 && n < 10)
            return 1;
        return (1 + digit_count(n / 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(digit_count(n));
        sc.close();

    }

}
