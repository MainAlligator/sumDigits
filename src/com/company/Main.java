package com.company;


public class Main {

    public static void main(String[] args) {

        int result = sumDigits(669);
    }

    public static int sumDigits(int number) {

        int sum = 0;
        if (number >= 10) {
            for (int i = number; number != 0; number /= 10) {
                sum += number % 10;

            }
            System.out.println("Сумма чисел: " + sum);

        }
        return -1;
    }
}






