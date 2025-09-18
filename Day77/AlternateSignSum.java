package Day77;

import java.util.Scanner;

public class AlternateSignSum {
    static int sumOfSeries(int n){
        if(n == 0) return 0;

        int sum = sumOfSeries(n-1);
        if(n % 2 ==0)  sum -= n;
        else sum+=n;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Elements");
        int n = sc.nextInt();
        System.out.println(sumOfSeries(n));
        sc.close();
    }
}