package lesson3.homeWork.Exceptions;

public class EmptinessException extends Exception {

    public EmptinessException(){
        super("Пустые строки вводить нельзя, попытайтесь снова.");
    }
}
