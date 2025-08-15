package Day60;

import java.util.Scanner;
import java.util.Stack;


public class isbracketvalid {
    static boolean isvalid(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(') st.push(ch);
            else{
                if(st.size() == 0 && ch == ')') return false;
                else st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets");
        String str = sc.nextLine();
        System.out.println(isvalid(str));
        sc.close();
    }
    
}
