package collections;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Double> set = new TreeSet<>(Collections.reverseOrder());
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                if (scanner.hasNextDouble()) {
                    set.add(scanner.nextDouble());
                }
            }
        }

        for (Double num : set) {
            System.out.println(num + " ");
        }
    }
}
