package lesson3.classworkTask4;

public class Task4 {

    /*
    Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
    MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
     */

    public static void main(String[] args) {

        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        Task4 sum = new Task4();
        try {
            System.out.println(sum.sumString(arr));
        } catch (MyArraySizeException e) {
            System.out.println(e);
        } catch (MyArrayDataException e) {
            System.out.println(e);
        }


    }

    public static int sumString(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (matrix.length != 4 || matrix[1].length != 4) {
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    try {
                        sum += Integer.parseInt(matrix[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }

            }
        }
        return sum;
    }
}
