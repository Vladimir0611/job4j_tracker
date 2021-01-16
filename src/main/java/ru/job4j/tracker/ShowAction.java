package ru.job4j.tracker;

public class ShowAction implements UserAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all Items ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all Items ====");
        Item[] item = tracker.findAll();
        for (int index = 0; index < item.length; index++) {
            System.out.println(item[index]);
        }
            return true;

    }
}
