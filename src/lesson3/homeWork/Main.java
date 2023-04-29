package lesson3.homeWork;

import lesson3.homeWork.UserData.AddingUserData;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");
        startProgram();

    }

    public static void startProgram() {
        try {
            AddingUserData.addingUserDataToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

