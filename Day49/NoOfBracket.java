package Day49;

import java.util.Scanner;
import java.util.Stack;

public class NoOfBracket {
    static int bracket_required(String str) {
        Stack<Character> st = new Stack<>();
        int unmatched = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                st.push(ch);
            else {
                if (!st.isEmpty())
                    st.pop();
                else {
                    unmatched++;
                }
            }
        }
        return (st.size() + unmatched);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brackets");
        String str = sc.nextLine();
        System.out.println(bracket_required(str));
        sc.close();

    }

}
