package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {

        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name:  ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (int index = 0; index < item.length; index++) {
                System.out.println(item[index]);
            }
        }else{
            System.out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
