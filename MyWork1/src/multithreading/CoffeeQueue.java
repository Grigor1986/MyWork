package multithreading;

import java.sql.Time;

public class CoffeeQueue {
    private int pendingOrders = 10;

    public synchronized boolean takeOrder() {
        if (pendingOrders > 0) {
            pendingOrders --;
            return true;
        }
        return false;
    }
    public int getRemaining() {
        return pendingOrders;
    }
}

class Barista implements Runnable {
    private CoffeeQueue queue;

    public Barista(CoffeeQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
    String name = Thread.currentThread().getName();
        while (queue.takeOrder()) {
            System.out.println(name + " взял заказ. Осталось в очереди: " + queue.getRemaining());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                System.out.println(name + " прервали!");
            }
            }
    }
}
class CoffeeShopSimulator {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Кофейня открылось. Поступило 10 заказов. ");
        long startTime = System.currentTimeMillis();
        CoffeeQueue coffeeQueue = new CoffeeQueue();
        Thread barista1 = new Thread(new Barista(coffeeQueue), "Бариста Иван");
        Thread barista2 = new Thread(new Barista(coffeeQueue), "Бариста Анна");
        Thread barista3 = new Thread(new Barista(coffeeQueue), "Бариста Герман");

        barista1.start();
        barista2.start();
        barista3.start();

        barista1.join();
        barista2.join();
        barista3.join();


long endTime = System.currentTimeMillis();
        System.out.println("Кофейня закрыта. Все заказы выполнены за время: " + (endTime - startTime) + " мс.");
    }
}
