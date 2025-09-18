package Day77;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfIndices {
    static ArrayList<Integer> findTarget(int[] arr,int target){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target) a.add(i);
        }
        return a;
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
        System.out.println("Enter Target");
        int x = sc.nextInt();
        System.out.println(findTarget(arr, x));
        sc.close();
    }
    
}
