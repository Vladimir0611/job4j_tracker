package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity = 11;
        int i = 1;
        while (quantity > 0) {
            while (i < 3) {
                System.out.println("Количество спичек на столе:" + quantity);
                System.out.println("Игрок " + i + " берет спички: ");
                int select = Integer.valueOf(input.nextLine());
                if (select <= 3 && select >= 1 && select <= quantity) {
                    quantity = quantity - select;
                    System.out.println("Количество спичек взятое Игроком " + i + " : " + select);

                } else {
                    if (select > quantity) {
                        System.out.println("Вы хотите взять больше спичек чем есть на столе:");
                    } else {
                        System.out.println("Необходимо взять от 1 до 3 спичек:");
                    }
                }
                i++;
                continue;

            }
            if (quantity == 0) {
                System.out.println("Игрок " + i + "  победил");
                break;
            }
            i = 1;
        }
    }
}
