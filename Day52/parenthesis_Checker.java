package Day52;

import java.util.Scanner;
import java.util.Stack;

public class parenthesis_Checker {
    static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '{' || ch == '(' || ch == '[') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                else{
                    if(st.peek() =='(' && ch == ')') st.pop();
                    else if(st.peek() == '{' && ch == '}') st.pop();
                    else if(st.peek() == '[' && ch == ']') st.pop();
                    else return false;
                }
        
            }
        }
        if(st.isEmpty()) return true;
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bracket");
        String str = sc.nextLine();
        System.out.println(isValid(str));
        sc.close();
    }
}
