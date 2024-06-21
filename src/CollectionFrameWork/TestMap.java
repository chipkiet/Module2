package src.CollectionFrameWork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Cohn", 40);
        hashMap.put("Bob", 50);
        hashMap.put("Ferry", 57);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap +"\n");
        System.out.println(hashMap.get("Bob"));


        Map<String, Integer>treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap +"\n");


        LinkedHashMap<String, Integer > linkedHashMap = new LinkedHashMap<>(16, 075f, true);
        linkedHashMap.put("Chip", 1);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Ram", 2);
        linkedHashMap.put("Tommy",5);
        System.out.println();
        System.out.println(linkedHashMap.get("Tommy"));

        for (Map.Entry<String, Integer> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + "=" +entry.getValue());
        }


    }
}
