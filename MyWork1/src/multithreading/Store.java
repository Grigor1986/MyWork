package multithreading;

class Store {
    private int product = 0;

    public synchronized void get() {
        while (product < 1) {
        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        }
        product--;
        System.out.println("Покупатель купил 1 товар. Осталось: " + product);
        notify();
    }

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
            product++;
            System.out.println("Завод привез 1 товар. На складе: " + product);
        }
    }

    class Producer implements Runnable {
        private final Store store;

        public Producer(Store store) {
            this.store = store;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 6; i++) {
                store.put();
                try {
                    Thread.sleep(300); // Имитация времени на производство
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    class Consumer implements Runnable {
        private final Store store;

        public Consumer(Store store) {
            this.store = store;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 6; i++) {
                store.get();
                try {
                    Thread.sleep(500); // Имитация времени на использование товара
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

class Main {
        public static void main(String[] args) {
            Store store = new Store();
           Thread producerThread = new Thread(new Producer(store));
           Thread consumerThread = new Thread(new Consumer(store));
           producerThread.start();
           consumerThread.start();
        }
    }


