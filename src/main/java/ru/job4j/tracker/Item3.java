package ru.job4j.tracker;

public class Item3 {
    private int id;

    private String username;

    private String password;

    public Item3(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
        public int getId() {
            return id;
        }

    @Override
    public String toString() {
        return "Item3{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }

