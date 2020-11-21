package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

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
        for (int index = 0; index < size; index++) {
            Item name = this.items[index];
            if (name.getName().equals(key)) {
                find[size] = name;
                size++;
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
        Item current = findById(id);
        current.setName(item.getName());
        return index != -1 ? true : false;
    }

    }

