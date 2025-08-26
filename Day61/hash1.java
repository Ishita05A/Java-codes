package Day61;

import java.util.*;
public class hash1 {
    public static void main(String[] args) {
        
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Rahul",34);
        mp.put("Ajay",23);
        mp.put("Avinash",24);
        System.out.println(mp.get("Rahul"));
        mp.putIfAbsent("Naveen", 26);
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
    }
}
