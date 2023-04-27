package lesson3.classworkTask3;

public class Main {

    /*
    Создайте класс исключения, который будет выбрасываться при делении на 0.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.
    Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
    Исключение должно отображать понятное для пользователя сообщение об ошибке
    Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.
     */

    public static void main(String[] args) {

        try{
            throw new ByZero();
        } catch (ByZero e){
            System.out.println(e);
        }

        try{
            throw new EmptyArray();
        } catch (EmptyArray e){
            System.out.println(e);
        }

        try{
            throw new AbsentFile();
        } catch (AbsentFile e){
            System.out.println(e);
        }

    }


}
