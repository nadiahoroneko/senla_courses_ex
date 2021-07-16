package ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Напишите программу, которая возвращает количество "троек" в заданной строке.
  Тройка - это символ, появляющийся три раза подряд в строке.*/

public class Main {
    public static void main(String[] args){
        String str = "aaab000nnmnm.1.0111";

        System.out.println(searchTriplet(str));
    }

    private static int searchTriplet(String str){
        Pattern pattern = Pattern.compile("(\\w)\\1\\1");
        Matcher matcher = pattern.matcher(str);
        int result = 0;
        while (matcher.find()) {
            result++;
        }
        return result;
    }
}
