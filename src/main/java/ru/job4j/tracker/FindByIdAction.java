package ru.job4j.tracker;

public class FindByIdAction implements UserAction{
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item By Id ====");
        int id = Integer.valueOf(input.askStr("Enter id:  "));
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item.getName());
        } else {
            out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
