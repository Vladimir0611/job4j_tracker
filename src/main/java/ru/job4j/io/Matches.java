package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        int quantity = 11;
        boolean turn = true;
        while (quantity > 0) {

                String player = turn ? "Первый игрок" : "Второй игрок";
                System.out.println(player + " введите число от 1 до 3:");
                turn = !turn;
                int wrong = 1;
                while (wrong == 1) {
                    int select = Integer.parseInt(input.nextLine());
                if (select <= 3 && select >= 1 && select <= quantity) {
                    quantity = quantity - select;
                    System.out.println("Количество спичек которое взял " + player + " : " + select);
                    System.out.println("Количество спичек на столе: " + quantity);
                    wrong = 0;

                } else {
                    if (select > quantity) {
                        System.out.println("Вы хотите взять больше спичек чем есть на столе:");
                    } else {
                        System.out.println("Необходимо взять от 1 до 3 спичек:");
                    }
                    continue;
                }
            }
        }
            if (!turn) {
                System.out.println("Выиграл первый игрок");
            } else {
                System.out.println("Выиграл второй игрок");
            }
        }
    }

