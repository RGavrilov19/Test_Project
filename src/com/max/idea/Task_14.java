package com.max.idea;


import java.util.Random;


public class Task_14 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random random = new Random();
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = random.nextInt(40) - 20;
        }
        int min_el = arr[0];
        int max_el = arr[0];
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]>max_el)
                max_el = arr[i];
            if(arr[i]<min_el)
                min_el = arr[i];
        }
        int max_abs = Math.max(Math.abs(min_el), Math.abs(max_el));
        System.out.printf("Максимальный элемент: %d\n", max_el);
        System.out.printf("Минимальный элемент: %d\n", min_el);
        System.out.printf("Максимальный по модулю: %d\n", max_abs);
    }
}
