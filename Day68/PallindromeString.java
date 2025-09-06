package Day68;

import java.util.Scanner;

public class PallindromeString {
    static String reverseStr(String s) {
        StringBuilder str = new StringBuilder(s);
        String ans = "";
        int n = str.length();
        str.reverse();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder word = new StringBuilder("");

            while (i < n && str.charAt(i) != ' ') {
                word.append(str.charAt(i));
                i++;
            }
            if (word.length() > 0)
                word.reverse();
            ans += " " + word;
        }
        return ans.substring(1).toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Parenthesis");
        String str = sc.nextLine();
        String s = reverseStr(str);
        System.out.println(s);
        sc.close();
    }

}
