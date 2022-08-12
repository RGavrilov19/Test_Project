package com.max.idea;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = in.nextInt();
        System.out.println("Введите число y: ");
        int y = in.nextInt();
        System.out.println("Введите число z: ");
        int z = in.nextInt();
        float b = (float)(x+y+z)/3;
        System.out.printf("Среднее арифметическое: %f \n", b);
        double c = Math.floor(b/2);
        if (c>3)
            System.out.println("Программа выполнена корректно");
    }
}
