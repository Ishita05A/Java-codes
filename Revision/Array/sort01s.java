package Revision.Array;
import java.util.Scanner;
public class sort01s {
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
           if(arr[i] == 0) i++;
           else if(arr[j] == 1) j--;
           else{
            swap(arr, i, j);
            i++;
            j--;
           }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        display(arr);
        sc.close();

    }
    
}
