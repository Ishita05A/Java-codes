package Day77;

import java.util.Scanner;

public class Rec6 {
    static int gcd(int x,int y){
        if(x == 0) return y;
        return gcd(y%x, x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int x = sc.nextInt(); 
        System.out.println("Enter 2nd number");
        int y = sc.nextInt();
        System.out.println(gcd(x, y));
        sc.close();
        
        


        
    }
    
}
