package CollectionsFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class InterfaceSpliterator {

    public static List<Double> spliteratorWork(List<Double> lst){
        List<Double> sqrs = new ArrayList<>();
        Spliterator<Double> spliterator = lst.spliterator();
        spliterator.forEachRemaining(item -> {
            if (item > 1) {
                sqrs.add(Math.sqrt(item));
            }
        });
        return sqrs;
    }

    public static void print(List<Double> list){
        Spliterator<Double> secondPart = list.spliterator();
        // trySplit() отделяет первую часть и возвращает её.
        // Исходный spliterator (secondPart) теперь содержит вторую часть.
        Spliterator<Double> firstPart = secondPart.trySplit();
        if (firstPart != null) {
            firstPart.forEachRemaining(item -> {
                if (item >= 2) {
                    System.out.println(item);
                }
            });
        }
        System.out.println(); // Печать пустой строки
        secondPart.forEachRemaining(item -> {
            if (item >= 10) {
                System.out.println(item);
            }
        });
    }

    public static void main(String[] args) throws IOException {
        print(spliteratorWork(Arrays.stream(new BufferedReader(new InputStreamReader(System.in))
                .readLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList())));
    }
    }

