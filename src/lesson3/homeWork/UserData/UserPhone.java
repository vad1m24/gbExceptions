package lesson3.homeWork.UserData;

import lesson3.homeWork.Exceptions.EmptinessException;
import lesson3.homeWork.Exceptions.InputNumberException;
import lesson3.homeWork.Exceptions.PhoneNumberException;

import java.util.Scanner;

public class UserPhone {

    public static long writingPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш номер телефона формата '375 ХХ ХХХ ХХ ХХ'");
        String input = scanner.nextLine();
        try {
            checkingPhoneNumber(input);
            return Long.parseLong(checkingPhoneNumber(input));
        } catch (EmptinessException | InputNumberException | PhoneNumberException e) {
            System.out.println(e);
            writingPhoneNumber();
        }
        return 0;
    }

    private static String  checkingPhoneNumber(String input) throws EmptinessException, InputNumberException, PhoneNumberException {
        String result = input.replaceAll("\\s+", "");
        result = result.trim();
        if (result.equals("")) {
            throw new EmptinessException();
        }
        if (result.length() != 12){
            throw new PhoneNumberException();
        }
        if (!checkingNumbers(result)) {
            throw new InputNumberException();
        }
        return result;
    }

    private static boolean checkingNumbers(String result) {
        for (int i = 0; i < result.length(); i++) {
            if(!Character.isDigit(result.charAt(i))){
                    return false;
                }
            }
        return true;
    }
}
