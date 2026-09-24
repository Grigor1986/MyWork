package collections;

import java.util.*;

public class CollectionsMap {
    public static void main(String[] args) {
        Map<String, String> mapA = new HashMap<>();
        SortedMap<String,Integer> mapB = new TreeMap<>();
        mapA.put("key1", "element 1");
        mapA.put("key2", "element 2");
        mapA.put("key3", "element 3");
        //получить ключи
        Iterator<String> iterator = mapA.keySet().iterator();
        iterator.forEachRemaining(System.out::println);
        Iterator<String> iterator1 = mapA.values().iterator();
//        while (iterator1.hasNext()) {
//            Object key = iterator.next();
//            Object value = mapA.get(key);
            iterator1.forEachRemaining(System.out::println);

            for (Map.Entry<String, Integer> entry : mapB.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                System.out.println(key + ":" + value);
                mapB.forEach((k, v) -> System.out.println(key + ":" + value));
            }
        }
    }

