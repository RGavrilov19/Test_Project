package com.max.idea;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String x = in.nextLine();
        String[] x_split = x.split(" ");
        int cnt_latin = 0;
        for (String s : x_split)
            if (s.matches("^[a-zA-Z]+$")) {
                System.out.printf(s + " ");
                cnt_latin++;
            }
        System.out.println();
        System.out.printf("Количество слов из латиницы: %d", cnt_latin);
    }
}
