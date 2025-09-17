package Day76;

import java.util.Scanner;

public class Rec4 {
    static int fibbo(int n){
        if(n <= 1) return n;
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(fibbo(n));
        sc.close();
    }
    
}
