package Day76;

import java.util.Scanner;



public class RecQ1 {
    static void displayReverse(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        displayReverse(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        displayReverse(n);
        sc.close();
    }
    
}
