package ex5;

/*Создать программу, которая будет:
 -подсчитывать количество гласных в словах
 -выводить слова отсортированные по кол-ву гласных (сперва те у которых больше гласных)
 -делать первую гласную букву в слове заглавной
Предложение вводится вручную. Разделитель пробел (“ ”).
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение:");
        PropertiesString ps = new PropertiesString(sc.nextLine());
        System.out.println(ps.sortByVowel());
    }
}
