package Day71;

import java.util.Scanner;
import java.util.Stack;

public class infixStack {
    static void infix_Stack(String str){
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0;i<st.size();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >=48 && ascii <= 57){
                String s = "" + ch;
                st.push(s);
            }
            else if(op.size() == 0){
                op.push(ch);
            }
            else if(ch == ')'){
                while(ch != '('){
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String s = o+v1+v2;
                    st.push(s);

                }
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        // String str = sc.nextLine();
        sc.close();

    }
    
}
