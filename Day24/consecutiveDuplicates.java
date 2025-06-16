package Day24;

import java.util.Scanner;

public class consecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder("" + str.charAt(0));
        int count = 1;
        char ch = ' ';
        for (int i = 0; i < str.length() - 1; i++) {
            ch = str.charAt(i + 1);
            if (str.charAt(i) == str.charAt(i + 1))
                count++;
            else {
                sb.append(count);
                sb.append(ch);
                count = 1;

            }
        }
        sb.append(count);
        System.out.println(sb);
        sc.close();
    }

}
