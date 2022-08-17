package com.max.idea;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        int x = 19;
        int y = 5;
        int z = 13;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] arr = new int[size];
        int i;
        for (i=0;i<size;i++)
        {
            System.out.printf("Введите %d-й элемент массива:\n",i);
            arr[i] = in.nextInt();
        }
        for (i=0;i<size;i++)
        {
            if(arr[i]==x || arr[i]==y || arr[i]==z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
        if (i==size)
            System.out.println("Данных значений в константах нет");
    }
}
