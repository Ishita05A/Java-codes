package Day35;

import java.util.Scanner;

public class RemoveDuplicates {
    static int remove_duplicates(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;
        int i = 0;

        for (int j = 1; j < n; j++) {

            if (arr[j] != arr[i]) {
                arr[++i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = remove_duplicates(arr);
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }

}
