package streamAPI.findFirstAndFindAny;

import java.util.Arrays;
import java.util.List;

public class Runner1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

// Последовательный стрим
        System.out.println(list.stream().findFirst()); // всегда 1
        System.out.println(list.stream().findAny());// почти всегда 1, но спецификация не гарантирует

// Параллельный стрим
        System.out.println(list.parallelStream().findFirst()); // всегда 1 (первый при разбиении)
        System.out.println(list.parallelStream().findAny());// может быть 3, 4 или другой — недетерминирован
    }
}
