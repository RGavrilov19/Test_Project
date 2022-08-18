package com.max.idea;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-3во строк");
        int size_row = in.nextInt();
        System.out.println("Введите кол-во столбцов");
        int size_col = in.nextInt();
        int[][] arr = new int[size_row][size_col];
        int i;
        int j;
        for (i = 0; i < size_row; i++)
        {
            for(j = 0; j<size_col; j++)
            {
                System.out.printf("Введите элемент %d-й строки %d-го столбца:\n", i, j);
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Результат:");
        for (i=0; i<size_col; i++)
            System.out.printf("%d ", arr[0][i]*3);
    }
}
