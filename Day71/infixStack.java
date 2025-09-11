package Day71;

import java.util.Scanner;
import java.util.Stack;
public class infixStack {
    static int precedence(char c){
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 2;
        return -1;
    }
    static String infix_Stack(String str) {
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)) st.push("" + ch);
            else if(ch == '(') op.push(ch);
            else if(ch == ')'){
                while (op.peek() != '('){
                    char o = op.pop();
                    String v2 = st.pop();
                    String v1 = st.pop();
                    st.push(o+v1+v2);
                }
                op.pop();
            }
            else{
                while(!op.isEmpty() && op.peek() != '(' && precedence(ch) <= precedence(op.peek())){
                    char o = op.pop();
                    String v2 = st.pop();
                    String v1 = st.pop();
                    st.push(o+v1+v2);
                }
                op.push(ch);
            }
        }
        while(!op.isEmpty()){
            char o = op.pop();
            String v2 = st.pop();
            String v1 = st.pop();
            st.push(o+v1+v2);
        }
        return st.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(infix_Stack(str));
        sc.close();

    }

}
