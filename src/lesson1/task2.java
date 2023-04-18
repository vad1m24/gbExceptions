package lesson1;

import java.util.Arrays;

public class task2 {

    /*
        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
        каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
        Если длины массивов не равны, необходимо как-то оповестить пользователя.
        Важно: При выполнении метода единственное исключение,
        которое пользователь может увидеть - RuntimeException, т.е. ваше.
    */

    public static void main(String[] args) {

        int []arr1 = new int[]{10, 15, 20, 25};
        int []arr2 = new int[]{5, 10, 15, 20};
        int []arr3 = new int[]{2, 4, 6};

        System.out.println(Arrays.toString(differenceElements(arr1, arr2)));
        System.out.println(Arrays.toString(differenceElements(arr1, arr3)));
        System.out.println(Arrays.toString(differenceElements(arr3, null)));

    }

    public static void checkSize(int []arr1, int []arr2){
        if (arr1 == null || arr2 == null){
            throw new RuntimeException("Ошибка, массив является null");
        } else if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
    }

    public static float[] differenceElements(int []arr1, int []arr2){
        checkSize(arr1,arr2);
        int size = arr1.length;
        float []diffArr = new float[size];
        for (int i = 0; i < size; i++) {
            diffArr[i] = (float) arr1[i] / (float) arr2[i];
        }
        return diffArr;
    }

}
