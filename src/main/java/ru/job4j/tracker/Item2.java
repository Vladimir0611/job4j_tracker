package ru.job4j.tracker;

import java.time.LocalDateTime;


public class Item2 {
    private LocalDateTime created;

    public LocalDateTime getCreated() {
        return created;
    }

    public Item2() {
        this.created = created.now();
    }
}
