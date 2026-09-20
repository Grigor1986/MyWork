package streamAPI;

import java.util.Scanner;
import java.util.function.Predicate;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Predicate<Integer> integerPredicate = integer -> integer > 0;
        System.out.println(integerPredicate.test(i));

    }
}
