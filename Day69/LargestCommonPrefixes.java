

import java.util.Arrays;
import java.util.Scanner;

public class LargestCommonPrefixes {
    static String largest_prefix(String[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        StringBuilder ans = new StringBuilder("");
        char[] first = arr[0].toCharArray();
        char[] last = arr[n-1].toCharArray();
        for(int i = 0;i<first.length;i++){
            if(first[i] != last[i]) break;
            ans.append(first[i]);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter String");
        String[] arr = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        System.out.println(largest_prefix(arr));
        sc.close();
    }
    
}
