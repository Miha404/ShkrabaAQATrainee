package main.java.com.company;

import static main.java.com.company.ConsoleInput.scanner;

public class Main {
    /*
    Метод taskManager() создан, чтобы с его помощью выбрать и запустить алгоритм нужного тестового задания.
    Метод greetOrNotGreetUser() реализует алгоритм задания №1
    Метод helloVyacheslav() реализует алгоритм задания №2
    Метод getMultiplesOfThree() реализует алгоритм задания №3 и выводит елемент массива, значение которого кратно 3.
    Метод getMultiplesOfThree() реализует алгоритм задания №3 и выводит елемент массива, индекс которого кратен 3.
     */
    public static void main(String[] args) {
        taskManager();
    }

    private static void taskManager() {
        System.out.println("Choose number of task:");
        System.out.println("1 - Task #1");
        System.out.println("2 - Task #2");
        System.out.println("3 - Task #3");
        System.out.println("4 - Task #3.1");
        System.out.println("Enter number of task: ");
        int taskNumber = scanner.nextInt();
        switch (taskNumber) {
            case (1):
                greetOrNotGreetUser();
                break;
            case (2):
                helloVyacheslav();
                break;
            case (3):
                getMultiplesOfThree();
                break;
            case (4):
                getMultiplesOfThird();
                break;
            default:
                System.out.println("Incorrect number");
                break;
        }

    }

    private static void getMultiplesOfThird() {
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        if (arrayLength <= 0) {
            System.out.println("Invalid array length");
        } else {
            int[] array = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                System.out.print(String.format("Enter %d element: ", i));
                array[i] = scanner.nextInt();
            }
            System.out.println("Array elements which index is multiple of 3: ");
            for (int i = 0; i < arrayLength; i++) {
                if (i % 3 == 0 && i != 0) {
                    System.out.print(String.format("%d ", array[i]));
                }
            }
        }
    }

    private static void getMultiplesOfThree() {
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        if (arrayLength <= 0) {
            System.out.println("Invalid array length");
        } else {
            int[] array = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                System.out.print(String.format("Enter %d element: ", i));
                array[i] = scanner.nextInt();
            }
            System.out.println("Array elements which value is multiple of 3: ");
            for (int i = 0; i < arrayLength; i++) {
                if (array[i] % 3 == 0 && array[i] != 0) System.out.print(String.format("%d ", array[i]));
            }
        }
    }

    private static void helloVyacheslav() {
        System.out.println("Введите имя: ");
        String inputName = scanner.next();
        if (inputName.equals("Вячеслав")) {
            System.out.println(String.format("Привет, %s", inputName));
        } else {
            System.out.println("Нет такого имени");
        }
    }

    private static void greetOrNotGreetUser() {
        System.out.println("Enter number: ");
        double userNumber = scanner.nextDouble();
        if (userNumber > 7) {
            System.out.println("Hello!");
        }
    }
}
