package Day49;

import java.util.Scanner;
import java.util.Stack;

public class validBracket {
    static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.empty())
                    return false;
                char top = st.peek();
                if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']'))
                    return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brackets");
        String str = sc.nextLine();
        System.out.println(isValid(str));
        sc.close();
    }
}
