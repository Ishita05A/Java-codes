package Day49;

import java.util.Scanner;
import java.util.Stack;

public class stack_BalancedBracket {
    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(')
                st.push(ch);
            else {
                if (st.isEmpty())
                    return false;
                st.pop();
            }

        }
        return (st.isEmpty());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }

}
