package com.max.idea;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = in.nextInt();
        int y = 0;
        if (x == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - карат, 3 - фунт, 4 - пуд");
            y = in.nextInt();
        } else if (x == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            y = in.nextInt();
        } else System.out.println("Некорректный выбор физической величины");
        if ((x == 1 || x == 2) && (y < 1 || y > 4))
            System.out.println("Некорректный выбор единицы измерения");
        System.out.println("Введите кол-во единиц");
        float z = in.nextFloat();
        System.out.println("Результат: ");
        switch (x) {
            case 1:
                switch (y) {
                    case 1:
                        System.out.printf("Килограмм: %f\n", z);
                        System.out.printf("Карат: %f\n", z * 5000);
                        System.out.printf("Фунтов: %f\n", z * 2.2);
                        System.out.printf("Пудов: %f\n", z * 0.061);
                        break;
                    case 2:
                        System.out.printf("Килограмм: %f\n", z * 0.0002);
                        System.out.printf("Карат: %f\n", z);
                        System.out.printf("Фунтов: %f\n", z * 0.00044);
                        System.out.printf("Пудов: %f\n", z * 0.0000122);
                        break;
                    case 3:
                        System.out.printf("Килограмм: %f\n", z * 0.45);
                        System.out.printf("Карат: %f\n", z * 2267.96);
                        System.out.printf("Фунтов: %f\n", z);
                        System.out.printf("Пудов: %f\n", z * 0.028);
                        break;
                    case 4:
                        System.out.printf("Килограмм: %f\n", z * 16.38);
                        System.out.printf("Карат: %f\n", z * 81900);
                        System.out.printf("Фунтов: %f\n", z * 36.11);
                        System.out.printf("Пудов: %f\n", z);
                        break;
                }
                break;
            case 2:
                switch (y) {
                    case 1:
                        System.out.printf("Метров: %f\n", z);
                        System.out.printf("Миль: %f\n", z * 0.00062);
                        System.out.printf("Ярдов: %f\n", z * 1.09);
                        System.out.printf("Футов: %f\n", z * 3.28);
                        break;
                    case 2:
                        System.out.printf("Метров: %f\n", z * 1609.34);
                        System.out.printf("Миль: %f\n", z);
                        System.out.printf("Ярдов: %f\n", z * 1760);
                        System.out.printf("Футов: %f\n", z * 5280);
                        break;
                    case 3:
                        System.out.printf("Метров: %f\n", z * 0.91);
                        System.out.printf("Миль: %f\n", z * 0.00057);
                        System.out.printf("Ярдов: %f\n", z);
                        System.out.printf("Футов: %f\n", z * 3);
                        break;
                    case 4:
                        System.out.printf("Метров: %f\n", z * 0.3);
                        System.out.printf("Миль: %f\n", z * 0.00019);
                        System.out.printf("Ярдов: %f\n", z * 0.33);
                        System.out.printf("Футов: %f\n", z);
                        break;
                }
                break;
        }
    }
}
