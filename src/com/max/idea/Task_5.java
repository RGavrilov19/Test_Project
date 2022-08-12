package com.max.idea;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = in.nextInt();
        System.out.println("Введите число y: ");
        int y = in.nextInt();
        System.out.println("Введите операнд: ");
        String z = in.next();
        switch (z) {
            case  '+' + "":
                System.out.printf("Результат вычислений: %d\n", x + y);
                break;
            case '-' + "":
                System.out.printf("Результат вычислений: %d\n", x - y);
                break;
            case '*' + "":
                System.out.printf("Результат вычислений: %d\n", x * y);
                break;
            case '/' + "":
                System.out.printf("Результат вычислений: %f \n", (float)x/y);
                break;
        }
    }
}
