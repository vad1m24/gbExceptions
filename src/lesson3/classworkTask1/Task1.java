package lesson3.classworkTask1;

public class Task1 {

    /*
    Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
    (тело самого метода прописывать не обязательно).
    Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().
     */

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void doSomething() throws RuntimeException {
        throw new RuntimeException("This is exception");
    }

}
