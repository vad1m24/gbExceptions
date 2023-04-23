package lesson2;

import javax.naming.PartialResultException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class classwork {

    /*
    Запишите в файл следующие строки:
    Анна=4
    Елена=5
    Марина=6
    Владимир=?
    Константин=?
    Иван=4
    Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если студенты
    с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?, заменить
    его на соответствующее число.Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее
    исключение.Записать в тот же файл данные с замененными символами ?.
    */

    public static void main(String[] args) {

        ArrayList<String> arr1 = convert(read());
        try (BufferedWriter br = new BufferedWriter(new FileWriter("txt2.txt"))) {
            String line;
            for (String i : arr1) {
                br.write(i + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> read() {
        File fr = new File("txt");
        try (BufferedReader br = new BufferedReader(new FileReader(fr))) {
            String line;
            ArrayList<String> arr = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                arr.add(line);
            }
            return arr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        //fr.close();
        return new ArrayList<>();
    }

    public static ArrayList<String> convert(ArrayList<String> dataName2) {
        ArrayList<String> dataName = new ArrayList<>();
        for (int i = 0; i < dataName2.size(); i++) {
            int size = dataName2.get(i).length();
            StringBuilder sb2 = new StringBuilder();
            for (int j = 0; j < size; j++) {
                if (dataName2.get(i).charAt(j) == '?') {
                    sb2.append(size - 2);
                } else
                    sb2.append(dataName2.get(i).charAt(j));
            }
            dataName.add(sb2.toString());
        }
        return dataName;
    }
}
