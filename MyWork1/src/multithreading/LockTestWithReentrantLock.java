package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTestWithReentrantLock {
    private final Lock lock = new ReentrantLock();

    public void count() {
        lock.lock();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockTestWithReentrantLock lockTest = new LockTestWithReentrantLock();
        Runnable task = lockTest::count;

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
