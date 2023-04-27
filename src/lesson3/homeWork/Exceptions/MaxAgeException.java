package lesson3.homeWork.Exceptions;

public class MaxAgeException extends Exception {

    public MaxAgeException(){
        super("Проверьте корректность ввода возраста. Он не может быть выше 100 лет и менее 0!");
    }
}
