package Day22;

import java.util.Scanner;

public class convertCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            boolean flag = true;
            if (curr == ' ')
                continue;
            int ascii = (int) curr;
            if (ascii > 97)
                flag = false;
            if (flag) {
                ascii += 32;
                char ch = (char) ascii;
                str.setCharAt(i, ch);
            } else {
                ascii -= 32;
                char ch = (char) ascii;
                str.setCharAt(i, ch);
            }
        }
        System.out.println(str);
        sc.close();
    }

}
