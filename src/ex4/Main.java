package ex4;

/*Создать программу, которая будет вычислять и
 выводить на экран простые множители из которых состоит целое число,
 введенное пользователем.
 Если введено не целое число, то сообщать ему об ошибке.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите число:");
            findPrimeMultipliers(sc.nextInt());
        }catch(InputMismatchException ex){
            System.out.println("Неверный формат числа: "+ex);
        }
    }

    public static void findPrimeMultipliers(int val){
        int tmp = val;
        int multiplier = 2;
        System.out.print("Простые множители числа "+val+": ");
        while (tmp > 1 && multiplier <= val) {
            if (tmp % multiplier == 0) {
                System.out.print(multiplier + " ");
                tmp /= multiplier;
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if (tmp != 1) {
            System.out.print(tmp);
        }
    }
}
