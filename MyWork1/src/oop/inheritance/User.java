package oop.inheritance;

import java.util.Scanner;

public class User {
    protected String login;

    public void login(String login) {
        System.out.println("User " + login + " вошел в систему");
    }
}
class Admin extends User {
    public void ban() {
        System.out.println("Admin " + login + " заблокировал пользователя");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loginInput = scanner.nextLine();
        Admin admin = new Admin();
        admin.login(loginInput);
        admin.ban();
    }
}
