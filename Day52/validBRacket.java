package Day52;

import java.util.Scanner;
import java.util.Stack;

public class validBRacket {
    static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' ) st.push(ch);
            else{
                if(st.isEmpty()) return false;
                else st.pop();
            }
        }
        if(st.size()>0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brackets");
        String str = sc.nextLine();
        System.out.println(isValid(str));
        sc.close();
        
    }
    
}
