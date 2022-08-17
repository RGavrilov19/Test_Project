package com.max.idea;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        int res_sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n");
        int n = in.nextInt();
        for (int i=1;i<=n;i++)
            if (i%2==1)
                res_sum += i;
        System.out.printf("Сумма нечетных чисел до n: %d", res_sum);
    }
}
