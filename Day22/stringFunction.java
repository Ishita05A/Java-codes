package Day22;

import java.util.Scanner;

public class stringFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Length of String = " + str.length());
        System.out.println("Enter 2nd String");
        String gtr = sc.nextLine();
        System.out.println(str.compareTo(gtr));
        System.out.println("Index of a = " + str.indexOf('a'));
        System.out.println(str.charAt(2));
        System.out.println(str.concat(gtr));
        System.out.println(str.substring(1, 4));
        System.out.println(str.substring(5));
        sc.close();
    }

}
