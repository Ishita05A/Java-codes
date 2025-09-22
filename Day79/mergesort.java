import java.util.Scanner;

public class mergesort {
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void merge(int[] arr,int st , int end,int mid){
        int[] left = new int[mid-st+1];
        int[] right = new int[end - mid];
        for(int i = 0;i<left.length;i++){
            left[i] = arr[st+i]; 
        }
        for(int i = 0;i<right.length ;i++){
            right[i] = arr[mid+i+1];
        }
        int i = 0;
        int j = 0;
        int k = st;
        while(i< left.length && j<right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i];
                i++;
            }
            else{
                arr[k++] = right[j];
                j++;
            }
        }
        while(i<left.length){
            arr[k++] = left[i++];
        }
        while(j<right.length) arr[k++] = right[j++];

    }
    static void mergeSort(int[] arr,int st, int end){
        if(st>=end) return;
        int mid = (st + end)/2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, st, end, mid);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n-1);
        display(arr);
        sc.close();
    }
}
