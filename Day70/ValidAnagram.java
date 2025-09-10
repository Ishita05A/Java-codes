package Day70;

import java.util.Scanner;

public class ValidAnagram {
    static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] count = new int[26];
        for(int i = 0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
        }
        for(int i = 0;i<s2.length();i++){
            count[s2.charAt(i)-'a']--;
        }
        for(int i = 0;i<count.length;i++){
            if(count[i] != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Enter 2nd String");
        String t = sc.nextLine();
        System.out.println(isAnagram(str, t));
        sc.close();
    }
    
}
