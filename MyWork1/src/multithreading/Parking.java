package multithreading;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Parking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int p = scanner.nextInt();
       int c = scanner.nextInt();
        Semaphore semaphore = new Semaphore(p);
        int parkingCount = 0;
        for (int i = 0; i < c; i++) {
            if (semaphore.tryAcquire()) {
                parkingCount++;
            }
        }
        System.out.println("Припарковано: " + parkingCount);
    }
}
