package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt())
            return;
        int n = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add(scanner.nextInt());

    }
        integers.removeIf(result -> result < 0);
        System.out.println(integers);
}
    }

