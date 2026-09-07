package collections;

import java.util.Scanner;

public class Parser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Integer val;
        if ("null".equals(s)) {
            val = null;
        } else {
            val = Integer.parseInt(s);
        }
        if (val != null) {
            System.out.println(val * 2);
        } else {
            System.out.println("Данные отсутствуют");
        }
    }
}
