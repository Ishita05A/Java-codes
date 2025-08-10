package Day59;

import java.util.Scanner;

public class sumOfRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no. of Queries");
        int q = sc.nextInt();
        for(int i = 1; i<n;i++){
            arr[i] = arr[i]+arr[i-1];   
        }
        while(q>0){
            System.out.println("Enter range");
            
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l == 1){
                System.out.println(arr[r-1]);
            }
            else System.out.println(arr[r-1] - arr[l-2]);
            q--;
        }
        sc.close();
    }
}
