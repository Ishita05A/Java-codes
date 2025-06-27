package Day35;

import java.util.Scanner;

public class Find_sqRoot {
    static int search_sq_root(int x) {
        int st = 0;
        int end = x;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid;
            if (val <= x) {
                ans = mid;
                st = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(search_sq_root(n));
        sc.close();
    }

}
