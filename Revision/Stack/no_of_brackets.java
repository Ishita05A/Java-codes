package Revision.Stack;

import java.util.Scanner;
import java.util.Stack;

public class no_of_brackets {
    static int brackets(String str) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(')
                st.push(ch);
            else if (st.size() == 0 && ch == ')') {
                count++;
            } else
                st.pop();
        }
        return st.size() + count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets");
        String str = sc.nextLine();
        System.out.println(brackets(str));
        sc.close();

    }

}
