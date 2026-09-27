package CollectionsFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class InterfaceIterator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (String str : reader.readLine().split(" ")) {
            list.add(Integer.parseInt(str));
        }
            list.removeIf(num -> num % 2 == 0);
            Collections.sort(list);
            list.forEach(System.out::println);
        }
    }

