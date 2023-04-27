package lesson3.classworkTask2;

import java.io.IOException;

public class Task2 {

    /*
    Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
    Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
    Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
    При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
     */

    public static class Count implements AutoCloseable {
        private Integer value = 0;

        public void add() throws IOException {
            if (isClose()) {
                throw new IOException("Ресурс закрыт ");
            }
            value += 1;
        }

        public Integer getValue() throws IOException{
            if (isClose()) {
                throw new IOException("Ресурс закрыт ");
            }
            return value;
        }

        @Override
        public void close() throws Exception {
            value = null;
        }

        public boolean isClose() {
            return value == null;
        }

        public static void main(String[] args) {

        }
    }
}
