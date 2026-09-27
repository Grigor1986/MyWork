package CollectionsFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CollectionTreeSet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }

        String[] sets = line.split(";");
        if (sets.length < 3) {
            // На случай некорректного ввода — можно выбросить исключение или выйти
            return;
        }

        Set<Integer> set1 = parseToSet(sets[0]);
        Set<Integer> set2 = parseToSet(sets[1]);
        Set<Integer> set3 = parseToSet(sets[2]);

        TreeSet<Integer> resultTreeSet = unionTreeLargeNumber(set1, set2, set3);
        // Выводим элементы, каждый на новой строке
        for (Integer num : resultTreeSet) {
            System.out.println(num);
        }
    }

    private static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        TreeSet<Integer> resultSet = new TreeSet<>(Comparator.reverseOrder());
        if (set1 != null && !set1.isEmpty()) {
            resultSet.add(Collections.max(set1));
        }
        if (set2 != null && !set2.isEmpty()) {
            resultSet.add(Collections.max(set2));
        }
        if (set3 != null && !set3.isEmpty()) {
            resultSet.add(Collections.max(set3));
        }
        return resultSet;
    }

    private static Set<Integer> parseToSet(String part) {
            Set<Integer> result = new HashSet<>();
            if (part == null || part.trim().isEmpty()) {
                return result;
            }
            String[] numbers = part.trim().split("\\s+"); // разбиваем по пробелам (включая множественные)
            for (String numStr : numbers) {
                if (!numStr.isEmpty()) {
                    result.add(Integer.parseInt(numStr));
                }
            }
            return result;
        }

    }

