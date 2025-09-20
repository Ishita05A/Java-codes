package Day78;

import java.util.HashMap;
import java.util.Scanner;

public class Anamgram {
    static HashMap<Character,Integer> makeMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!mp.containsKey(ch)) mp.put(ch,1);
            else mp.put(ch, mp.get(ch)+1);
        }
        return mp;
    }
    static boolean isAnagram(String s , String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp1 = makeMap(s);
        HashMap<Character,Integer> mp2 = makeMap(t);
        return mp1.equals(mp2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s = sc.nextLine();
        System.out.println("Enter String 2");
        String t = sc.nextLine();
        System.out.println(isAnagram(s, t));
        sc.close();
    }
    
}
