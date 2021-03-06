package ru.job4j.tracker;

import java.util.Arrays;

public final class Tracker {

    private static Tracker instance = null;

    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private Tracker(){

    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }


    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {

        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] find = new Item[size];
        int findSize = 0;
        for (int index = 0; index < findSize++; index++) {
            Item name = this.items[size];
            if (name.getName().equals(key)) {
                find[size] = name;
            }
        }
        return Arrays.copyOf(find, findSize);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {

        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            items[index].setId(id);
        }
        return index != -1;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
        }
        return index != -1;
    }

    }

