package lesson3.classworkTask3;

public class EmptyArray extends NullPointerException{

    public EmptyArray(){
        super("Обратились к пустому массиву");
    }
}
