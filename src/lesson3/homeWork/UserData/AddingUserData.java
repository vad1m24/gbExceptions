package lesson3.homeWork.UserData;

import lesson3.homeWork.Exceptions.InputNameException;
import lesson3.homeWork.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class AddingUserData {


    public static void addingUserDataToFile() throws IOException {

        String[] arr = UserName.writingFullName();
        String surname = arr[0];
        String name = arr[1];
        String secondName = arr[2];
        String birthday = UserBirthDate.writingBirthDate();
        String sex = UserSex.writingSex();
        long phoneNumber = UserPhone.writingPhoneNumber();
        String text = surname + "\n" + name + "\n" + secondName + "\n" + birthday + "\n" +
                sex + "\n" + phoneNumber + "\n\n";

        String path = System.getProperty("user.dir");
        File folder = new File(path);
        int count = 0;
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (!(file.getName().equals(surname))) {
                count += 1;
                System.out.print("");
            } else {
                count = -1;
                try (FileWriter fw = new FileWriter(surname, true)) {
                    fw.write(text);
                    System.out.println("Пользователь успешно добавлен.");
                    break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        if (count > 0) {
            File file = new File(surname);
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            System.out.println("Пользователь успешно добавлен.");
            writer.close();
        }
        makingAdvice();

    }

    private static void makingAdvice() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Хотите ли вы добавить еще одного пользователя?
                    Да - 'Y', нет - 'N'.""");
            String input = scanner.nextLine();
            String answer = input.toUpperCase();
            try {
                checkingAnswerInput(answer);
                if (answer.equals("Y")) {
                    Main.startProgram();
                } else if (answer.equals("N")) {
                    System.out.println("До свидания.");
                    break;
                }
            } catch (InputNameException e) {
                System.out.println(e + " Да - 'Y', нет - 'N'.");
            }
        }
    }

    private static void checkingAnswerInput(String answer) throws InputNameException {
        String[] arr = answer.split("");
        if (arr.length > 1) {
            throw new InputNameException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[0].equals("Y")) {
                if (!arr[0].equals("N")) {
                    throw new InputNameException();
                }
            }
        }
    }

}
