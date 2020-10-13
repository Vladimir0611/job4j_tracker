package ru.job4j.pojo;

public class Library {

    public static void main (String[] arg) {
        Book one = new Book ("One", 35);
        Book two = new Book ("Two", 70);
        Book three = new Book ("Three", 55);
        Book clean = new Book ("Clean Code", 40);
        Book[] books = new Book [4];
        books[0] = one;
        books[1] = two;
        books[2] = three;
        books[3] = clean;

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getNumber());
        }

        System.out.println("Replace index 0 to 3.");
        Book change = new Book ("change", 0);
        change = books[0];
        books[0] = books[3];
        books[3] = change;
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getNumber());
        }


        System.out.println("Shown only Clean code name");
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            if (b.getName().equals("Clean Code") == true) {
                System.out.println(b.getName() + " - " + b.getNumber());
            }
        }
    }
}
