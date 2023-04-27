package lesson3.homeWork.Exceptions;

public class InputNameException extends Exception{

    public InputNameException(){
        super("Вводиться могут только буквы!");
    }
}
