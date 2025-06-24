package Day31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bucketsort {
    static void display(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bucket_sort(float[] arr) {
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }
        for (int i = 0; i < n; i++) {
            int bucket_idx = (int) arr[i] * 10;
            buckets[bucket_idx].add(arr[i]);
        }
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        int idx = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[idx++] = currBucket.get(j);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = { 0.4f, 0.2f, 0.7f, 0.3f, 0.1f };
        bucket_sort(arr);
        display(arr);
        sc.close();

    }

}
