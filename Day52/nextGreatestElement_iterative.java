package Day52;

import java.util.Scanner;

public class nextGreatestElement_iterative {
    static void iterative(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        for(int i = 0; i<n;i++){
            res[i] = -1;
            for(int j = i+1; j<n;j++){
                if(arr[j]>arr[i]){
                    res[i] = arr[j];
                    break;
                } 
            }
        }
        for(int i = 0; i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no .of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] =sc.nextInt();
        }
        iterative(arr);
        sc.close();

    }
    
}
