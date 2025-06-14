package Day22;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "physics";
        for (int i = 2; i < 4; i++) {
            System.out.println(str.substring(i));
        }
        String gtr = "abcd";
        for (int i = 0; i < gtr.length(); i++) {
            for (int j = i + 1; j < gtr.length(); j++) {
                System.out.print(gtr.substring(i, j) + " ");
            }
        }
        sc.close();
    }

}
