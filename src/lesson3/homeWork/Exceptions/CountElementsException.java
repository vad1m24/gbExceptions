package lesson3.homeWork.Exceptions;

public class CountElementsException extends Exception{

    public CountElementsException(){
        super("Проверьте вводимые данные. В случае двойных имен, фамилилий или отчеств впишите текст через тире.");
    }
}
