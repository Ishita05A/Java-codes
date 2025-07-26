package Day51;

import java.util.Scanner;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Luv", 22);
        mp.put("Yash", 19);
        mp.put("Rishika", 18);
        mp.put("Harry", 18);
        System.out.println(mp.get("Akash"));
        mp.remove("Yash");
        System.out.println(mp.containsKey("Yash"));
        mp.putIfAbsent("Nakul", 24);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        sc.close();
    }

}
