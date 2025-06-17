package Day25;

import java.util.Scanner;

public class recursion_Nto1 {
    static void recursion(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        recursion(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        recursion(n);
        sc.close();
    }

}
