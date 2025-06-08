package Day16;

import java.util.Scanner;
import java.util.Stack;

public class quest1 {
    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                st.push(ch);
            else {
                if (st.size() == 0)
                    return false;
                if (st.peek() == '(')
                    st.pop();
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
        System.out.println(isBalanced(str));
        sc.close();

    }

}
