package lesson3.homeWork.UserData;

import lesson3.homeWork.Exceptions.ContDaysAndMonthException;
import lesson3.homeWork.Exceptions.CountDatesException;
import lesson3.homeWork.Exceptions.MaxAgeException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class UserBirthDate {

    public static String writingBirthDate() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите вашу дату рождения в формате 'ДД.ММ.ГГГГ'");
            String input = scanner.nextLine();
            try {
                return changingDateFormat(input);
            } catch (ParseException e) {
                System.out.println("Проверьте вводимые данные, формат даты рождения только числами - 'ДД.ММ.ГГГГ'!");
            } catch (CountDatesException | MaxAgeException | ContDaysAndMonthException e) {
                System.out.println(e);
            }
        }
    }

    private static String changingDateFormat(String input) throws ParseException, CountDatesException, MaxAgeException, ContDaysAndMonthException {
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        if (!checkingDateInput(input)) {
            throw new CountDatesException();
        }
        Date date = formatter.parse(input);
        String result = formatter.format(date);
        Duration duration = Duration.between(date.toInstant(), Instant.now());
        if ((duration.toDays() / 365) > 100 || (duration.toDays() / 365) <= 0) {
            throw new MaxAgeException();
        }
        String[] arr = input.split("\\.");
        if (Integer.parseInt(arr[0]) > 31 || Integer.parseInt(arr[0]) < 1) {
            throw new ContDaysAndMonthException();
        }
        if (Integer.parseInt(arr[1]) > 12 || Integer.parseInt(arr[1]) < 1) {
            throw new ContDaysAndMonthException();
        }
        return result;
    }

    private static boolean checkingDateInput(String input) throws CountDatesException {
        String[] arr = input.split("\\.");
        if (arr.length != 3) {
            throw new CountDatesException();
        }
        return true;
    }
}
