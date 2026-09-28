package CollectionsFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class WordCountTask {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
SortedMap<String, Integer> map = new TreeMap<>();
for (String s : strings) {
    map.put(s, map.getOrDefault(s, 0) + 1);
}
        return map;
    }

    public static void printMap(Map<String, Integer> map) {
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
    }

    public static void main(String[] args) throws IOException {
        printMap(wordCount(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ")));
        }
    }
