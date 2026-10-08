package streamAPI;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    Task2() {
    }

    public static void main(String[] args) {
        List<People> peoples = Arrays.asList(new People("Вася", 17, Sex.MAN)
                , new People("Таня", 38, Sex.WOMAN)
                , new People("Ваня", 56, Sex.MAN)
                , new People("Вика", 19, Sex.WOMAN)
                , new People("Семен", 26, Sex.MAN)
                , new People("Виталий", 22, Sex.MAN)
                , new People("Милана", 28, Sex.WOMAN));
        List<People> peopleList1 = (List)peoples.stream()
                .filter((p) -> p.getAge() > 20 && p.getAge() < 30 && p.getSex() == Sex.MAN)
                .collect(Collectors.toList());
        Stream var10000 = peopleList1.stream();
        PrintStream var10001 = System.out;
        Objects.requireNonNull(var10001);
        var10000.forEach(var10001::println);
        double average = peopleList1.stream()
                .filter((p) -> p.getSex() == Sex.MAN)
                .mapToInt(People::getAge).average().getAsDouble();
        System.out.println(average);
        List<People> peopleList2 = (List)peoples.stream()
                .filter((p) -> p.getAge() >= 18)
                .filter((p) -> p.getSex() == Sex.MAN && p.getAge() < 60 || p.getSex() == Sex.WOMAN && p.getAge() < 55)
                .collect(Collectors.toList());
        System.out.println(peopleList2);
    }
}

class People {
    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String toString() {
        String var10000 = this.name;
        return "People{name='" + var10000 + "', age=" + this.age + ", sex=" + String.valueOf(this.sex) + "}";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Sex getSex() {
        return this.sex;
    }
}

enum Sex {
    MAN,
    WOMAN;

    private Sex() {
    }
}

