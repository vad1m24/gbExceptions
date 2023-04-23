package lesson2.homework;

import java.util.ArrayList;

public class task3 {

    /*
        Дан следующий код, исправьте его там, где требуется
        public static void main(String[] args) throws Exception {
           try {
               int a = 90;
               int b = 3;
               System.out.println(a / b);
               printSum(23, 234);
               int[] abc = { 1, 2 };
               abc[3] = 9;
           } catch (Throwable ex) {
               System.out.println("Что-то пошло не так...");
           } catch (NullPointerException ex) {
               System.out.println("Указатель не может указывать на null!");
           } catch (IndexOutOfBoundsException ex) {
               System.out.println("Массив выходит за пределы своего размера!");
           }
        }
        public static void printSum(Integer a, Integer b) throws FileNotFoundException {
           System.out.println(a + b);
        }
     */

    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println("Пример деления: " + a + " / " + b + " = " + a / b);
            printSum(23, 234);
            ArrayList<Integer> abc = new ArrayList<>();
            abc.add(1);
            abc.add(2);
            System.out.println("Список текущих чисел - " + abc);
            int index = 3;
            int number = 9;
            if (index > abc.size()) {
                for (int i = abc.size(); i < index; i++) {
                    abc.add(i, null);
                }
            }
            abc.add(index, number);
            System.out.println("Обновленный список - " + abc);
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException e) {
            System.out.println("Делимое не может быть равно 0!");
        } catch (Throwable e) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println("Пример сложения: " + a + " + " + b + " = " + (a + b));
    }

}
