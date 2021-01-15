package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askInt("Enter id:  "));
        if (tracker.delete(id)) {
            System.out.println("Delete had been succes");
        } else {
            System.out.println("Delete falled");
        }
        return true;
    }
}
