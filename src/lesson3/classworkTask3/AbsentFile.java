package lesson3.classworkTask3;

import java.io.FileNotFoundException;

public class AbsentFile extends FileNotFoundException {

    public AbsentFile(){
        super("Такого файла нет");
    }

}
