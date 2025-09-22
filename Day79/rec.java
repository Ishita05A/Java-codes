import java.util.Scanner;

public class rec {
    static void print(int sr, int sc,int er,int ec,String s){
        if(sr > er || sc > ec) return;
        if(sr == er && sc == ec){
            System.out.println(s);
        }
        print(sr+1, sc, er, ec, s+'D');
        print(sr, sc+1, er, ec, s+'R');

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int r = sc.nextInt();
        System.out.println("Enter columns");
        int c = sc.nextInt();
        print(1, 1, r, c, "");
        sc.close();
        
    }
}
