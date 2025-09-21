package Day78;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic {
    static boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> mp = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            char gh = t.charAt(i);
            if(!mp.containsKey(ch)) mp.put(ch, gh);
            else{
                if(gh != mp.get(ch)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s = sc.nextLine();
        System.out.println("Enter String 2");
        String t = sc.nextLine();
        System.out.println(isIsomorphic(s, t));
        sc.close();
    }
    
}
