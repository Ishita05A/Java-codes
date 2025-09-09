package Day70;

import java.util.Scanner;

public class isStringIsRotationOfOther {
    static boolean isRotated(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        String s = s1+s1;
        if(s.contains(s2)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Enter 2nd String");
        String t = sc.nextLine();
        System.out.println(isRotated(str, t));
        sc.close();
    }
    
}
