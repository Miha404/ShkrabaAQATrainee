package main.java.com.company;

import static main.java.com.company.ConsoleInput.scanner;

public class Main {

    public static void main(String[] args) {
        greetOrNotGreetUser();
        helloVyacheslav();
    }


    private static void helloVyacheslav() {
        System.out.println("Введите имя: ");
        String inputName = scanner.next();
        if (inputName.equals("Вячеслав")) System.out.println(String.format("Привет, %s", inputName));
        else System.out.println("Нет такого имени");
    }

    private static void greetOrNotGreetUser() {
        System.out.println("Введите число: ");
        double userNumber = scanner.nextDouble();
        if (userNumber > 7)
            System.out.println("Hello!");
    }
}
