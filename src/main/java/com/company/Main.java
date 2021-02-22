package com.company;

import static main.java.com.company.ConsoleInput.scanner;

public class Main {

    public static void main(String[] args) {
        greetOrNotGreetUser();
    }

    private static void greetOrNotGreetUser() {
        System.out.println("Введите число: ");
        double userNumber = scanner.nextDouble();
        if (userNumber > 7)
            System.out.println("Hello!");
    }
}
