package oop.setterGetter;

import java.util.Scanner;

public class FamilyAccount {
        private static int money = 1000;

        public void spend(int amount) {
            money -= amount;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int amountMan = scanner.nextInt();
            int amountWoman = scanner.nextInt();
            FamilyAccount man = new FamilyAccount();
            FamilyAccount woman = new FamilyAccount();
            man.spend(amountMan);
            woman.spend(amountWoman);
            System.out.println(FamilyAccount.money);
        }
    }


