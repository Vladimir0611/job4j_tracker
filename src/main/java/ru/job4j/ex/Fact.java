package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Factorial of 3 is : " + calc(3));
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
