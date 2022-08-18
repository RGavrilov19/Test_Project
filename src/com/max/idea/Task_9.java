package com.max.idea;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        double[] arr = new double[size];
        int i;
        double arr_sum=0;
        for (i = 0; i < size; i++) {
            System.out.printf("Введите %d-й элемент массива:\n", i);
            arr[i] = in.nextDouble();
        }
        for (i=0; i<size; i++)
            arr_sum+=arr[i];
        double arr_avg=arr_sum/size;
        System.out.println("Результат:");
        for (i=0; i<size; i++)
            System.out.printf("%f ", arr[i]*arr_avg);
    }
}
