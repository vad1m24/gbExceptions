package lesson3.homeWork.Exceptions;

public class ContDaysAndMonthException extends Exception {

    public ContDaysAndMonthException(){
        super("Проверьте вводимые данные. Количество дней в месяце не может быть более 31, а месяцев в году более 12.");
    }
}
