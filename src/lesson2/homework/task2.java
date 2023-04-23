package lesson2.homework;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task2 {

    /*
    Если необходимо, исправьте данный код:
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
     */

    public static void main(String[] args) {
        catchingExceptions();
    }

    public static void catchingExceptions(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше целое число.");
        try {
            int d = scanner.nextInt();
            if (d == 0){
                throw new ArithmeticException("Проверьте данные, делить на 0 нельзя!");
            }
            int[] intArray = new int[10];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = ThreadLocalRandom.current().nextInt(0, 20 + 1);
            }
            System.out.println("Вот сформированный массив:" + "\n"+ Arrays.toString(intArray));
            System.out.println("Делимое число = " + intArray[8]);
            double catchResult = (double) intArray[8] / d;
            System.out.println(intArray[8] +  "/" + d + " = " + catchResult);
        } catch (InputMismatchException e){
            System.out.println("Вводиться могут лишь цифры.");
            catchingExceptions();
        }
    }

}
