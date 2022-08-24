package com.max.idea;

import java.util.Scanner;

public class Task_final_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int n = in.nextInt();
        String[]lines = new String[n];
        Scanner in_lines = new Scanner(System.in);
        for (int i=0; i<n; i++)
        {
            System.out.printf("Введите %d-ю строку:\n", i);
            lines[i] = in_lines.nextLine();
        }
        int max_cnt_num = 0;
        int row_num = 0;
        for (int i=n-1; i>=0; i--)
        {
            if(max_cnt_num<=lines[i].chars().distinct().count()) {
                max_cnt_num = (int) lines[i].chars().distinct().count();
                row_num = i;
            }
        }
        System.out.printf("Ответ: %s", lines[row_num]);
    }
}
