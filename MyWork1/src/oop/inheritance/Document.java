package oop.inheritance;

import java.util.Scanner;

public class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }
}

class Report extends Document {
    private int pages;
    public Report(String title, int pages) {
        super(title);
        this.pages = pages;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();
        int pages = scanner.nextInt();
        Report report = new Report(title, pages);
        System.out.println("Report: " + report.title + ", Pages: " + report.pages);
    }
}
