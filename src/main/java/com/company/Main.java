package main.java.com.company;

import static main.java.com.company.ConsoleInput.scanner;

public class Main {

    public static void main(String[] args) {
        greetOrNotGreetUser();
        helloVyacheslav();
        getMultiplesOfThree();
    }

    private static void getMultiplesOfThree() {
        System.out.println("Введите длинну массива: ");
        int arrayLength = scanner.nextInt();
        if (arrayLength == 0) System.out.println("Введен пустой массив!");
        else {
            int[] array = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                System.out.print(String.format("Введите %d элемент: ", i));
                array[i] = scanner.nextInt();
            }
            System.out.println("Элементы массива, кратные 3: ");
            for (int i = 0; i < arrayLength; i++) {
                if (array[i] % 3 == 0 && array[i] != 0) System.out.println(String.format("%d ", array[i]));
            }
        }
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
