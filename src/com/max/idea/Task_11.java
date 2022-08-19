package com.max.idea;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String x = in.nextLine();
        System.out.println("Введите второе число:");
        int y = in.nextInt();
        int max_num = Math.max(Integer.valueOf(x), y);
        System.out.printf("Максимальное число: %d\n", max_num);
        double min_num = Math.min(Double.valueOf(x), y);
        System.out.printf("Минимальное число: %f\n", min_num);
    }
}
