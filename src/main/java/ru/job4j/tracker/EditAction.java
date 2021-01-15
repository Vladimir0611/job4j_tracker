package ru.job4j.tracker;

public class EditAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id:  "));
        String name = input.askStr("Enter name:  ");
        Item item = new Item();
        item.setName(name);
        if (tracker.replace(id, item)) {
            System.out.println("Replace had been succes");
        }
        return true;
    }
}
