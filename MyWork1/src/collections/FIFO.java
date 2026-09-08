package collections;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class FIFO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> q = new ArrayDeque<>();
        while (scanner.hasNext()) {
            String command = scanner.next();
            if ("ADD".equals(command)) {
                String task = scanner.next();
                q.add(task);
            } else if ("POLL".equals(command)) {
                if (q.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(q.poll());
                }
            } else if ("EXIT".equals(command)) {
                break;
            }
        }
    }
}

