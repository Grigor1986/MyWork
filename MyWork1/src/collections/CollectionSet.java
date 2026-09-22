package collections;

import java.util.*;

public class CollectionSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("первый");
        set.add("второй");
        set.add("третий");
        System.out.println(set.contains("третий"));
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, (o1, o2) -> {
            return o1.compareTo(o2);
        });
        System.out.println(list);
    }
}
