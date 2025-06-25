package Day33;

import java.util.Scanner;

public class MultipleOfNumber {
    static void multiple(int n, int k) {
        if (k == 0)
            return;
        multiple(n, k - 1);
        System.out.print(n * k + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Enter multiple times");
        int k = sc.nextInt();
        multiple(n, k);
        sc.close();
    }

}
