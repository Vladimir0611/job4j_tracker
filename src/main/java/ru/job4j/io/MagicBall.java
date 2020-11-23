package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main (String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        System.out.println(question);
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да");
        } if (answer == 1) {
            System.out.println("Нет");
        } if (answer == 2) {
            System.out.println("Может быть");
        }
    }
}
