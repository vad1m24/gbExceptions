package lesson2.homework;

import java.util.Scanner;

public class task4 {
    /*
        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */

    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");
        throwingVoidException();
    }

    public static void throwingVoidException() {
        System.out.println("Введите ваш текст.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split("");
        if (!checkingFullness(arr)) {
            input = "";
        }
        if (input.equals("")) {
            System.out.println("Пустые строки вводить нельзя, попытайтесь снова.");
            throwingVoidException();
        } else
            System.out.println("Вот ваш текст наоборот ))" + "\n" + reverseString(input));
    }

    public static boolean checkingFullness(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                if (i + 1 == arr.length) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String reverseString(String input) {
        return new StringBuffer(input).reverse().toString();
    }

}
