package lesson3.classworkTask4;

public class MyArrayDataException extends  Exception{

    public MyArrayDataException(int i, int j){
        super("В ячейке с индексами " + i + " и " + j + " не получилось конвертировать число.");
    }
}
