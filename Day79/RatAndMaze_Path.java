

import java.util.Scanner;

public class RatAndMaze_Path {
    static void maze(int sr,int sc,int er,int ec, String s){
        if(sr > er || sc > ec) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        maze(sr+1, sc, er, ec, s+"D");
        maze(sr, sc+1, er, ec, s+"R");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int r = sc.nextInt();
        System.out.println("Enter rows");
        int c = sc.nextInt();
        maze(1, 1, r, c, "");
        sc.close();

    }
    
}
