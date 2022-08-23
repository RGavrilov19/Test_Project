package com.max.idea;

import java.util.Scanner;

public class Task_final_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс валют:");
        double x = in.nextDouble();
        System.out.println("Введите сумму в рублях:");
        double y = in.nextDouble();
        System.out.printf("Итого: %.2f долларов", y/x);
    }
}
