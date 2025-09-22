
import java.util.HashSet;
import java.util.Scanner;

public class MaxOnTable {
    static int findMax(int[] arr){
        HashSet<Integer> table = new HashSet<>();
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(table.contains(arr[i])) table.remove(arr[i]);
            else{
                table.add(arr[i]);
                max = Math.max(max, table.size());
            }
        }
        return max;
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
        System.out.println(findMax(arr));
        sc.close();
        
    }
    
}
