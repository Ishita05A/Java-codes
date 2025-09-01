package Day63;

import java.util.Scanner;



public class sortaArray {
    static void display(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left] != 0 && arr[right] !=1){
                swap(arr, right, left);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1) right--;
                }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        display(arr);
        sc.close();
    }
}
