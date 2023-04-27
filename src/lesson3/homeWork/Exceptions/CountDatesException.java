package lesson3.homeWork.Exceptions;

public class CountDatesException extends Exception {

    public CountDatesException(){
        super("Проверьте корректность ввода данных. Числовой формат даты - 'ДД.ММ.ГГГГ'");
    }
}
