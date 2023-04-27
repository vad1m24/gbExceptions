package lesson3.homeWork.Exceptions;

public class PhoneNumberException extends Exception {

    public PhoneNumberException(){
        super("Проверьте вводимые данные. Номер должен состоять из чисел, без вспомогательных элементов, размером 12 символов.");
    }
}
