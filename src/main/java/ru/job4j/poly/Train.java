package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " перемещается по рельсам");
    }

    @Override
    public void ticketPrice() {
        System.out.println(getClass().getSimpleName() + " стоимость билета составляет 2000 рублей");
    }
}

