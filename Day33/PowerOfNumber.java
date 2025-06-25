package Day33;

import java.util.Scanner;

public class PowerOfNumber {
    static int power(int a, int b) {
        if (b == 1)
            return a;
        return (a * power(a, b - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter it's power");
        int b = sc.nextInt();
        System.out.println(power(a, b));
        sc.close();

    }

}
