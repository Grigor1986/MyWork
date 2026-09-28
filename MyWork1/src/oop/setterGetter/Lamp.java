package oop.setterGetter;

import java.util.Scanner;

public class Lamp {
    private boolean isOn;

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lamp lamp = new Lamp();
        boolean inputStatus = scanner.nextBoolean();
        lamp.setOn(inputStatus);
        if (lamp.isOn()) {
            System.out.println("Лампа светит");
        } else {
            System.out.println("Лампа потушена");
        }
    }
}
