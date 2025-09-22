import java.util.Scanner;
public class removeOccuranceofA {
    static String remove(String s,int idx){
        if(idx == s.length()) return "";
        String smallAns = remove(s, idx+1);
        char currChar = s.charAt(idx);
        if( currChar == 'a') return smallAns;
        return currChar+smallAns;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        System.out.println(remove(s, 0));
        sc.close();
    
    }
    
}
