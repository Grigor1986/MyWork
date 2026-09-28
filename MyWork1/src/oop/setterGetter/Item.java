package oop.setterGetter;

import java.util.Scanner;

public class Item {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int input = scanner.nextInt();
        Item item = new Item();
        item.setPrice(input);
        System.out.println(item.getPrice());
    }
}
