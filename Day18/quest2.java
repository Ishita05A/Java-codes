package Day18;

import java.util.Scanner;
import java.util.Stack;

public class quest2 {
    static int balanced(String str) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                st.push(ch);
            else {
                st.pop();
            }
        }
        count = st.size();
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(balanced(str));
        sc.close();

    }

}
