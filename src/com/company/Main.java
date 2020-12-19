package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите любое число: ");

        int result = s.nextInt();
        int summa = sumDigits(result);

        System.out.println("Сумма чисел которые вы вели: " + sumDigits(result));
    }


    public static int sumDigits(int number) {
        if (number / 10 >= 1) {
            int oneVar = number % 10;
            int remain = number / 10;
            return oneVar + sumDigits(remain);
        } else {
            return number;
        }

    }
}







