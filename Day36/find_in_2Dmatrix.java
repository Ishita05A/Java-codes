// rows and columns are sorted 
// first element of each row is greater than last element of prev row
package Day36;

import java.util.Scanner;

public class find_in_2Dmatrix {
    static boolean find_element(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int st = 0;
        int end = n * m - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int mid_elem = arr[mid / m][mid % m];
            if (mid_elem == target)
                return true;
            else if (target < mid_elem)
                end = mid - 1;
            else
                st = mid + 1;
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
