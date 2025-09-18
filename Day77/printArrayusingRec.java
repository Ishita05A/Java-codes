package Day77;

import java.util.Scanner;

public class printArrayusingRec {
    static void display(int[] arr ,int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+" ");
        display(arr, idx+1);
        
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
        display(arr, 0);
        sc.close();

    }
    
}
