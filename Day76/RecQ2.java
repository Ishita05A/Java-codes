package Day76;

import java.util.Scanner;

public class RecQ2 {
    static void display(int n){
        if(n == 0) return;
        display(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        display(n);
        sc.close();
    }
    
}
