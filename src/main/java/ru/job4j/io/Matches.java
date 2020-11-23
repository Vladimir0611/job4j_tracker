package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity = 11;
        int i1 = 1;
        int i2 = 1;
        while (quantity > 0) {
            while (i1 > 0) {
                System.out.println("Количество спичек на столе:" + quantity);
                System.out.println("Игрок 1 берет спички:");
                int select = Integer.valueOf(input.nextLine());
                if (select <= 3 && select >= 1) {
                    quantity = quantity - select;
                    System.out.println("Количество спичек взятое Игроком 1:" + select);
                    System.out.println("Количество спичек на столе:" + quantity);
                } else {
                    System.out.println("Необходимо взять от 1 до 3 спичек:");
                    continue;
                }
                i1 = 0;
            }
            if (quantity == 0) {
                System.out.println("Игрок 1 победил");
                break;
            }

            while (i2 > 0) {
                System.out.println("Игрок 2 берет спички:");
                int select2 = Integer.valueOf(input.nextLine());
                if (select2 <= 3 && select2 >= 1) {
                    quantity = quantity - select2;
                    System.out.println("Количество спичек взятое Игроком 1:" + select2);

                } else {
                    System.out.println("Необходимо взять от 1 до 3 спичек:");
                    continue;
                }
                i2 = 0;
            }
            if (quantity == 0) {
                System.out.println("Игрок 2 победил");
                break;
            }
            i1 = 1;
            i2 = 1;
        }
    }
}
