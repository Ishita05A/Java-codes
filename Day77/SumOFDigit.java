package Day77;

import java.util.Scanner;

public class SumOFDigit {
    static int sumOfDigit(int n){
        if(n < 10 && n > 0 ) return n;
        return n%10 + sumOfDigit(n/10);
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(sumOfDigit(n));
        sc.close();
    }
    
}
