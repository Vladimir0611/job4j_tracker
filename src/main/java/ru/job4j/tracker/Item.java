package ru.job4j.tracker;

import java.time.LocalDateTime;


public class Item {
    private int id;
    private String name;

    LocalDateTime created = LocalDateTime.now();

    public void main(String[] args) {
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}