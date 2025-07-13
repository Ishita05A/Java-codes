package Day45;

import java.util.Scanner;

public class gcd {
    static int Gcd(int x, int y) {
        if (y == 0)
            return x;
        return (Gcd(y, x % y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no. ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd no. ");
        int y = sc.nextInt();
        System.out.println(Gcd(y, x % y));
        sc.close();
    }

}
