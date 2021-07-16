package ex6;

import java.util.Scanner;

/*Создайте программу, которая будет получать число и печатать его в следующем
 формате (формы цифр можно придумать свою, главное чтобы она читалась на экране):
 (*) Дополнительно: сделайте так, чтобы «большая цифра» состояла не из ‘*’,
 а из соответствующих маленьких(обычных) цифр.*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        Digit.digitToString(sc.nextInt());
    }
}
