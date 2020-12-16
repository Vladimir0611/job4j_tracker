package ru.job4j.poly;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " перемещается по автобанам");
    }

    @Override
    public void ticketPrice() {
        System.out.println(getClass().getSimpleName() + " стоимость билета составляет 1000 рублей");
    }
}
