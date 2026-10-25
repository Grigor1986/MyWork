package streamAPI.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static streamAPI.groupingBy.Transaction.txns;

public class CityTransactional {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> reportA = txns.stream()
                .collect(Collectors.groupingBy(
                        Transaction::city,
                        Collectors.groupingBy(
                                Transaction::currency,
                                Collectors.summingInt(Transaction::amount)
                        )
                ));
        reportA.forEach((city, currencyMap) -> {
            System.out.println("Город: " + city);
            currencyMap.forEach((currency, totalAmount) ->
                    System.out.printf("  └─ %s: %,d%n", currency, totalAmount)
            );
        });

    }
}
record Transaction(String city, String currency, int amount) {
    static List<Transaction> txns = List.of(
            new Transaction("Moscow", "RUB", 100),
            new Transaction("Moscow", "USD", 200),
            new Transaction("Spb", "RUB", 300),
            new Transaction("Moscow", "RUB", 150)
    );
}
