package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findAll();
        for (int index = 0; index < item.length; index++) {
            System.out.println(item[index]);
        }
            return true;

    }
}
