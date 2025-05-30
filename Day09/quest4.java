// search given no. on a array
package Day09;

import java.util.Scanner;

public class quest4 {
    static int search(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int x = sc.nextInt();
        System.out.println(search(arr, x));
        sc.close();

    }

}
