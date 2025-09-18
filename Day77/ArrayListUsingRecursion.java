package Day77;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUsingRecursion {
    static ArrayList<Integer> findTarget(int[] arr, int idx, int target) {

        if (idx >= arr.length)
            return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (arr[idx] == target)
            ans.add(idx);
        ArrayList<Integer> smallAns = findTarget(arr, idx + 1, target);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        System.out.println(findTarget(arr, 0, target));
        sc.close();
    }

}
