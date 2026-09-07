package collections;

import java.util.HashSet;
import java.util.Scanner;

public class Ddos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> unique = new HashSet<>();
        while (scanner.hasNext()) {
            String ip = scanner.next();
            if ("STOP".equals(ip)) {
                break;
            }
            unique.add(ip);
        }
        System.out.println(unique.size());
    }
}
