package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " перемещается в воздушном пространстве");
    }

    @Override
    public void ticketPrice() {
        System.out.println(getClass().getSimpleName() + " стоимость билета составляет 3000 рублей");
    }
}
