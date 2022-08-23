package com.max.idea;

import java.util.Scanner;

public class Task_final_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String x = in.nextLine();
        String[] equation = x.split("");
        String result;
        if (equation[0].equals("x"))
        {
                switch (equation[1]) {
                    case "+":
                        result = String.valueOf(Integer.parseInt(equation[4]) - Integer.parseInt(equation[2]));
                        break;
                    case "-":
                        result = String.valueOf(Integer.parseInt(equation[4]) + Integer.parseInt(equation[2]));
                        break;
                    default: result="Ошибка! Некорректно введено уравнение";
                }
        }
        else if (equation[2].equals("x"))
        {
            switch (equation[1]) {
                case "+":
                    result = String.valueOf(Integer.parseInt(equation[4]) - Integer.parseInt(equation[0]));
                    break;
                case "-":
                    result = String.valueOf(Integer.parseInt(equation[0]) - Integer.parseInt(equation[4]));
                    break;
                default: result="Ошибка! Некорректно введено уравнение";
            }
        }
        else if (equation[4].equals("x"))
        {
            switch (equation[1]) {
                case "+":
                    result = String.valueOf(Integer.parseInt(equation[0]) + Integer.parseInt(equation[2]));
                    break;
                case "-":
                    result = String.valueOf(Integer.parseInt(equation[0]) - Integer.parseInt(equation[2]));
                    break;
                default: result="Ошибка! Некорректно введено уравнение";
            }
        }
        else result="Ошибка! Некорректно введено уравнение";
        if(!result.equals("Ошибка! Некорректно введено уравнение"))
            System.out.print("Результат: x=");
        System.out.printf(result);
    }
}
