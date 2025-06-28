package Day36;

import java.util.Scanner;

public class element_in_2d_array {
    static boolean find_element(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (arr[i][j] == target)
                return true;
            else if (arr[i][j] > target)
                j--;
            else
                i++;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("Enter columns");
        int m = sc.nextInt();
        System.out.println("Enter Elements");
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();
        System.out.println(find_element(arr, target));
        sc.close();
    }

}
