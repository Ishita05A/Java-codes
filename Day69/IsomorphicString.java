
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicString {
    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!mp.containsKey(original)){
                if(!mp.containsValue(replacement)){
                    mp.put(original, replacement);
                }
                else return false;
            }
            else{
                char mappedchar = mp.get(original);
                if(mappedchar !=replacement) return false;

            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Enter 2nd String");
        String t = sc.nextLine();
        System.out.println(isIsomorphic(str, t));
        sc.close();


    }

}
