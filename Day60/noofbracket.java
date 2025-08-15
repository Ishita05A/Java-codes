package Day60;

import java.util.Scanner;
import java.util.Stack;

public class noofbracket {
    static int count_bracket(String str){
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(') st.push(ch);
            else{
                if(st.size() == 0 && ch==')'){
                    count++;
                }
                else st.pop();
            }

        }
        return count+st.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets");
        String str = sc.nextLine();
        System.out.println(count_bracket(str));
        sc.close();
    }
    
}
