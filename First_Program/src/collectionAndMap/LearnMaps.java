package collectionAndMap;
import java.util.*;

public class LearnMaps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("us", "United States");
        map.put("in", "India");
        map.put("en", "India");
        map.putIfAbsent("in", "India2");

        System.out.println(map);

        map.remove("us");
        System.out.println(map);

        System.out.println(map.containsKey("in"));
        System.out.println(map.containsValue("India"));
        System.out.println(map.get("in")); // if not present give null
        System.out.println(map.getOrDefault("dn", "Others"));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        System.out.println(keys);

        for(Map.Entry<String, String> it : map.entrySet()){
            System.out.println(it.getKey() + ", " + it.getValue());
        }
    }
}
