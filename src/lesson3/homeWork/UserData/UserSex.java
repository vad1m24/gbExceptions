package lesson3.homeWork.UserData;

import lesson3.homeWork.Exceptions.InputNameException;

import java.util.Scanner;

public class UserSex {

    public static String writingSex() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите ваш пол (F/M)");
            String input = scanner.nextLine();
            String sex = input.toUpperCase();
            try {
                return checkingSexInput(sex);
            } catch (InputNameException e) {
                System.out.println(e + " M - мужчина, F - женщина.");
            }
        }
    }

    private static String checkingSexInput(String sex) throws InputNameException {
        String[] arr = sex.split("");
        if (arr.length > 1) {
            throw new InputNameException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[0].equals("M")) {
                if (!arr[0].equals("F")) {
                    throw new InputNameException();
                }
            }
        }
        return arr[0];
    }
}
