package ru.itsjava.shop;

import java.util.Scanner;

public class SmartPhoneShop {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в магазин смартфонов");

        String[] smartPhone = new String[]{"iPhone_13", "Samsung_flip3", "Sony_Xperia_Pro", "Vertu_Signature_Touch"};
        printMenu();
        Scanner connsole = new Scanner(System.in);

        System.out.println("Введите номер меню");
        int menuNum = connsole.nextInt();

        while (true) {
            if (menuNum == 1) {
                printAllSmartPhone(smartPhone);
            } else if (menuNum == 2) {
                smartPhone = addSmartPhone(connsole, smartPhone);
            } else if (menuNum == 3) {
                smartPhone = removeSmartPhone(connsole, smartPhone);
            } else if (menuNum == 4) {
                bubbleSort(smartPhone);
            } else if (menuNum == 0) {
                System.out.println("Спасибо, что воспользовались нашим магазином");
                System.exit(0);
            }
            System.out.println("Введите номер меню");
            menuNum = connsole.nextInt();
        }
    }

    private static void bubbleSort(String[] smartPhone) {
        for (int j = 0; j < smartPhone.length; j++) {

            for (int i = 0; i < smartPhone.length - j - 1; i++) {
                if (smartPhone[i].charAt(0) > smartPhone[i + 1].charAt(0)) {
                    String temp = smartPhone[i];
                    smartPhone[i] = smartPhone[i + 1];
                    smartPhone[i + 1] = temp;
                }
            }
        }
    }

    private static String[] removeSmartPhone(Scanner connsole, String[] smartPhone) {
        System.out.println("Введите название смартфона");
        String inputSmartPhone = connsole.next();
        String[] resArray = new String[smartPhone.length - 1];

        int delIndex = 0;
        for (int i = 0; i < smartPhone.length; i++) {
            if (!smartPhone[i].equals(inputSmartPhone)) {
                resArray[i] = smartPhone[i];
            } else {
                delIndex = i;
                break;
            }
        }
//        int delIndex;
//        for (delIndex = 0; delIndex < smartPhone.length; delIndex++) {
//
//            if (smartPhone[delIndex].equals(inputSmartPhone)) {
//                break;
//            }
//            resArray[delIndex] = smartPhone[delIndex];
//        }

        for (int i = delIndex; i < resArray.length; i++) {
            resArray[i] = smartPhone[i + 1];

        }
        return resArray;
    }

    private static String[] addSmartPhone(Scanner connsole, String[] smartPhone) {
        System.out.println("Введите название смартфона");
        String inputSmartPhone = connsole.next();
        String[] resArray = new String[smartPhone.length + 1];

        for (int i = 0; i < smartPhone.length; i++) {
            resArray[i] = smartPhone[i];

        }
        resArray[smartPhone.length] = inputSmartPhone;

        return resArray;
    }

    private static void printAllSmartPhone(String[] smartPhone) {
        System.out.println("Наши смартфоны: ");
        for (int i = 0; i < smartPhone.length; i++) {
            System.out.print(smartPhone[i] + " ");
        }
        System.out.println();
    }

    public static void printMenu() {
        System.out.println("Меню:\n" +
                "1. Вывести все смартфоны\n" +
                "2. Добавить смартфон\n" +
                "3. Удалить смартфон\n" +
                "4. Отсортировать смартфоны\n" +
                "0. Выход");
    }
}
// Меню:
// 1. Вывести все смартфоны
// 2. Добавить смартфон
// 3. Удалить смартфон
// 4. Отсортировать смартфоны
// 0. Выход