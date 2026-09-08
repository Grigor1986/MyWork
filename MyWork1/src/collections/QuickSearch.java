package collections;

import java.util.HashMap;
import java.util.Scanner;

public class QuickSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, String> passports = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String numPassport = scanner.next();
            String surname = scanner.next();
            passports.put(numPassport, surname);
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            String queryPassport = scanner.next();
            String result = passports.get(queryPassport);
            if (result != null) {
                System.out.println(result);
            } else {
                System.out.println("Не найдено");
            }
        }
    }
}
