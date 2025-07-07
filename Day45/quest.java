package Day45;

import java.util.Scanner;

public class quest {
    static int digitsum(int n) {
        if (n < 10 && n > 0)
            return n;
        return (n % 10 + digitsum(n / 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(digitsum(n));
        sc.close();
    }

}
