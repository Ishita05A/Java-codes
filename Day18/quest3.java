package Day18;

import java.util.Scanner;
import java.util.Stack;

public class quest3 {
    static boolean isvalid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else
                    return false;
            } else if (!st.isEmpty() && ch == '}') {
                if (st.peek() == '{') {
                    st.pop();
                } else
                    return false;
            } else if (!st.isEmpty() && ch == ']') {
                if (st.peek() == '[')
                    st.pop();
                else
                    return false;
            }
        }
        if (st.size() == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(isvalid(str));
        sc.close();

    }

}
