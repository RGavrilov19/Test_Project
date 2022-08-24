package com.max.idea;

import java.util.Scanner;

public class Task_final_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        System.out.println("Ответ:");
        String answer;
        boolean clue = false;
        for (int i=1; i<=3; i++)
        {
           answer = in.nextLine();
           if (answer.equalsIgnoreCase("подсказка")) {
               if (i == 1) {
                   System.out.println("Подсказка уже недоступна\nОтвет:");
               } else {
                   System.out.println("Ответ связан с IT\nОтвет:");
                   clue = true;
               }
               i--;
               continue;
           }
           if (answer.equalsIgnoreCase("заархивированный вирус")) {
               System.out.println("Правильно!");
               break;
           }
           else if (i<=2 && !clue) System.out.println("Подумай еще! Ответ:");
           else {
               System.out.println("Обидно, приходи в другой раз");
               break;
           }
        }
    }
}
