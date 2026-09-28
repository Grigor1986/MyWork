package oop.setterGetter;

import java.util.Scanner;

public class Person {
    private int age;

    public boolean setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
            return true;
        } else {
            System.out.println("Недопустимый возраст");
            return false;
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        int inputAge = scanner.nextInt();
        if (person.setAge(inputAge)) {
            System.out.println(person.getAge());
        }
    }
}
