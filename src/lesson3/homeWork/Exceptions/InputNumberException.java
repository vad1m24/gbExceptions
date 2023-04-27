package lesson3.homeWork.Exceptions;

public class InputNumberException extends Exception {

    public InputNumberException(){
        super("Проверьте вводимые данные! Допускается воод только цифр, без дополнительных симвлов.");
    }
}
