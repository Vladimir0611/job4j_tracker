package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete Item ====");
        int id = Integer.valueOf(input.askInt("Enter id:  "));
        if (tracker.delete(id)) {
            out.println("Delete had been succes");
        } else {
            out.println("Delete falled");
        }
        return true;
    }
}
