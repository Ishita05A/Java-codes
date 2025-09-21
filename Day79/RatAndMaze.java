package Day79;

import java.util.Scanner;

public class RatAndMaze {
    static int maze(int sr,int sc,int er,int ec){
        if(sr > er || sc > ec) return 0;
        if(sr == er && sc == ec) return 1;
        int downWays = maze(sr+1, sc, er, ec);
        int rightWays = maze(sr, sc+1, er, ec);
        int totalWays = rightWays + downWays;
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int r = sc.nextInt();
        System.out.println("Enter columns");
        int c = sc.nextInt();
        System.out.println(maze(1, 1, r, c));
        sc.close();

    }
    
}
