package multithreading;

import java.util.Scanner;

class Counter {
int count = 0;
    public synchronized void add() {
count++;
    }

    public int getCount() {
        return count;
    }
}

public class DefenceRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                counter.add();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                counter.add();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getCount());

    }
}
