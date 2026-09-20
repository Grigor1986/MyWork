package streamAPI;

import java.util.Scanner;
import java.util.function.Function;

public class LengthWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String word = scanner.nextLine();
        Function<String, Integer> wordLength = String::length;
        System.out.println(wordLength.apply(word));
    }
}
