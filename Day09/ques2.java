//Sum = 1-2+3-4.....n
package Day09;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                sum -= i;
            else
                sum += i;
        }
        System.out.println(sum);
        sc.close();
    }

}
