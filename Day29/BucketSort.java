package Day29;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class BucketSort {
    static void bucket_sort(float[] arr) {
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < arr.length; i++) {
            buckets[i] = new ArrayList<Float>();
        }
        for (int i = 0; i < n; i++) {
            int bucket_idx = (int) arr[i] * n;
            buckets[bucket_idx].add(arr[i]);
        }
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        int idx = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); i++) {
                arr[idx++] = currBucket.get(j);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        float[] arr = new float[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bucket_sort(arr);
        for (float val : arr) {
            System.out.println(val + " ");
        }
        sc.close();

    }

}
