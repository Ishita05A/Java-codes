package Day28;

import java.util.Scanner;

public class sumOFDigits {
    static int sum_of_digits(int n) {
        if (n < 10 && n > 0)
            return n;
        return (n % 10 + sum_of_digits(n / 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int x = sum_of_digits(n);
        System.out.println(x);
        sc.close();
    }

}
