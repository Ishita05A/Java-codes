package Day51;

import java.util.*;

public class hashmap_iteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Luv", 22);
        mp.put("Yash", 19);
        mp.put("Rishika", 18);
        mp.put("Harry", 18);
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        for (var e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        sc.close();

    }

}
