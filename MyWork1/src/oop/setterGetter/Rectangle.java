package oop.setterGetter;

import java.util.Scanner;

public class Rectangle {
    private int w;
    private int h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getArea() {
        return w * h;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w1 = scanner.nextInt();
        int h1= scanner.nextInt();
        int w2 = scanner.nextInt();
        int h2= scanner.nextInt();

        Rectangle rectangle1 = new Rectangle(w1, h1);
        Rectangle rectangle2 = new Rectangle(w2, h2);
        rectangle1.getArea();
        rectangle2.getArea();
        System.out.println(rectangle1.getArea() + rectangle2.getArea());
    }
}
