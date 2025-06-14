package Day22;

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        str.setCharAt(0, 'm');
        System.out.println(str);
        str.append("world");
        System.out.println(str);
        str.insert(2, 'i');
        System.out.println(str);
        str.deleteCharAt(1);
        System.out.println(str);
        StringBuilder gtr = new StringBuilder(str.reverse());
        System.out.println(gtr);
        str.reverse();
        gtr.delete(1, 4);
        System.out.println(gtr);
        System.out.println(str);
        sc.close();
    }

}
