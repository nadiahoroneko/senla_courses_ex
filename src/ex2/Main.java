package ex2;

/*Напишите программу, которая возвращает сумму цифр,
 присутствующих в данной строке.
 Если цифр нет, возвращаемая сумма равна 0.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        String str = "aaab000nnmnm.1.011179";
        String str1 = "aaa";

        System.out.println(searchSum(str));
        System.out.println(searchSum(str1));
    }

    private static int searchSum(String str){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);
        int result = 0;
        while (matcher.find()) {
           result+= Integer.parseInt(str.substring(matcher.start(),matcher.end()));
        }
        return result;
    }
}
