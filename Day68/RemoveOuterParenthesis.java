package Day68;

import java.util.Scanner;

public class RemoveOuterParenthesis {
    static String removeOuterP(String str){
        StringBuilder s = new StringBuilder("");
        int count =0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){
                count++;
                if(count >=2) s.append(ch);
            }
            else if(ch == ')'){
                count--;
                if(count>0) s.append(ch);
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Parenthesis");
        String str = sc.nextLine();
        String s = removeOuterP(str);
        System.out.println(s);
        sc.close();
    }
    
}
