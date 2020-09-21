package ru.job4j.oop;

public class Item {

    public int id;

    public String name;

    public Item() {
    }

    public Item(String name) {
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.id = 2;
        item.name = "Item";
    }
}
