package Revision.Stack;

import java.util.Scanner;
import java.util.Stack;

public class balancedBracket {
    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                st.push(ch);
            else if (st.size() == 0 && ch == ')')
                return false;
            else
                st.pop();
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }

}
