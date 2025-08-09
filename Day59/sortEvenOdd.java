package Day59;

import java.util.Scanner;

public class sortEvenOdd {
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] % 2 == 0) left++;
            else if(arr[right] % 2 != 0) right --;
            else if(arr[left] % 2 != 0 && arr[right] %2 == 0){
                swap(arr, right,left);
                right--;
                left++;
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
