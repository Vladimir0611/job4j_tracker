package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Pust' begut neuclyuzhe");
        } else {
            if (position == 2) {
                System.out.println("Spokoinoy nochi");
            } else {
                System.out.println("Pesnya ne naidena");
            }
        }
    }
    public static void main(String[] args) {
        Jukebox pesnya = new Jukebox();
        pesnya.music(1);
        pesnya.music(2);
        pesnya.music(5);

    }
}
