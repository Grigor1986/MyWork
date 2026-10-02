package StepikMainCourse.scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n1 = s.charAt(0);
        int n3 = s.charAt(2);
        int n5 = s.charAt(4);
        n1 = n1 - 48;
        n3 = n3 - 48;
        n5 = n5 - 48;
        int sum = n1 + n3;
        System.out.println(sum);
        System.out.println(sum * n5);
    }
}
