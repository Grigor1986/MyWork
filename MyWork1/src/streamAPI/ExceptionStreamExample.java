package streamAPI;

import java.util.List;

public class ExceptionStreamExample {
    public ExceptionStreamExample() {
    }

    public static void main(String[] args) {
        List<Car> cars = List.of(new Car(0));
        cars.stream().forEach((car) -> {
            try {
                car.start();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
class Car {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public void start() throws Exception {
        if (this.fuel < 1) {
            throw new Exception("Нет бензина!");
        }
    }
}

