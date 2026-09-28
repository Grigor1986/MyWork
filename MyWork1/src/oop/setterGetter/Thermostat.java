package oop.setterGetter;

import java.util.Scanner;

public class Thermostat {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double t) {
        this.celsius = t;
    }

    public void setFahrenheit(double f) {
        this.celsius = (f - 32)/ 1.8;

    }

    public double getFahrenheit() {
        return celsius * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputFahrenheit  = scanner.nextDouble();
        double inputCelsius = scanner.nextDouble();
        Thermostat thermostat1 = new Thermostat();
        Thermostat thermostat2 = new Thermostat();
        thermostat1.setFahrenheit(inputFahrenheit);
        thermostat2.setCelsius(inputCelsius);
        System.out.println(thermostat1.getCelsius());
        System.out.println(thermostat2.getCelsius());
    }
}
