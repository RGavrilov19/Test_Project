package com.max.idea;


import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String x = in.nextLine();
        if(x.contains("Java") && x.startsWith("I like") && x.endsWith("!!!")) {
            System.out.println(x.toUpperCase());
        }
        System.out.println((x.substring(7,11)).replace('a', 'o'));
    }
}
