package lesson3.homeWork.UserData;

import lesson3.homeWork.Exceptions.CountElementsException;
import lesson3.homeWork.Exceptions.EmptinessException;
import lesson3.homeWork.Exceptions.InputNameException;
import java.util.Scanner;

public class UserName {

    public static String[] writingFullName() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите ваши данные (1.Фамилия 2.Имя 3.Отчество) через пробел, " +
                    "без дополнительной пунктуации.");
            String input = scanner.nextLine();
            try {
                return checkingFullness(input);
            } catch (EmptinessException | CountElementsException | InputNameException e) {
                System.out.println(e);
            }
        }
    }

    private static String[] checkingFullness(String input) throws EmptinessException, CountElementsException, InputNameException {
        String result = input.replaceAll("\\s+", " ");
        result = result.trim();
        if (result.equals("")) {
            throw new EmptinessException();
        }
        if (!checkingLetters(result)) {
            throw new InputNameException();
        }
        String[] arr = result.split(" ");
        changingLetterCase(arr);
        if (arr.length != 3) {
            throw new CountElementsException();
        }
        return arr;
    }

    private static void changingLetterCase(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
        }
    }

    private static boolean checkingLetters(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                if (!(c >= 'А' && c <= 'Я') && !(c >= 'а' && c <= 'я')) {
                    if (!((c == ' ') || (c == '-'))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
