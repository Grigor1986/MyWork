package streamAPI;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        //принимает одно значение проверяет и выдает правда или ложь
        Predicate<Integer> even = number -> number % 2 == 0;
        System.out.println(even.test(5));//false

        // принимает значение преобразует и возвращает другое
        Function<String, Integer> stringIntegerFunction = String::length;
        System.out.println(stringIntegerFunction.apply("Cucumber"));//8

        //интерфейс принимает и выводит на печать, ничего не возвращая
        Consumer<String> student = name -> System.out.println("Имя студента: " + name);
        student.accept("Николай");

        //ничего не принимает, производит мат действия и возвращает результат
        Supplier<Integer> number = () -> (int) (Math.random() * 5);
        System.out.println(number.get());
    }
}

