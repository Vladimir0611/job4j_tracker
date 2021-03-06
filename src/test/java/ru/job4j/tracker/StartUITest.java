package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = Tracker.getInstance();;
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                (
                        "Menu." + System.lineSeparator() +
                                "0. Exit" + System.lineSeparator()
                )
        ));
    }

        @Test
        public void whenFindAll() {
            Output out = new StubOutput();
            Input in = new StubInput(
                    new String[] {"0", "1"}
            );
            Tracker tracker = Tracker.getInstance();

            Item item = new Item();
            item.setName("item");
            tracker.add(item);

            UserAction[] actions = {
                    new ShowAction(out),
                    new ExitAction(out)
            };
            new StartUI(out).init(in, tracker, actions);
            assertThat(out.toString(), is(
                    (
                            "Menu." + System.lineSeparator() +
                                    "0. Show all Items " + System.lineSeparator() +
                                    "1. Exit" + System.lineSeparator() +
                                    "=== Show all Items ====" + System.lineSeparator() +
                                    "Item{id=1, name='item'}" + System.lineSeparator() +
                                    "Menu." + System.lineSeparator() +
                                    "0. Show all Items " + System.lineSeparator() +
                                    "1. Exit" + System.lineSeparator()

                    )
            ));
    }
    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "item", "1"}
        );
        Tracker tracker = Tracker.getInstance();

        Item item = new Item();
        item.setName("item");
        tracker.add(item);

        UserAction[] actions = {
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                (
                        "Menu." + System.lineSeparator() +
                                "0. Find by name" + System.lineSeparator() +
                                "1. Exit" + System.lineSeparator() +
                                "=== Find items by name ====" + System.lineSeparator() +
                                "item" + System.lineSeparator() +
                                "Menu." + System.lineSeparator() +
                                "0. Find by name" + System.lineSeparator() +
                                "1. Exit" + System.lineSeparator()

                )
        ));
    }
    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        Tracker tracker = Tracker.getInstance();

        Item item = new Item();
        item.setName("item");
        tracker.add(item);

        UserAction[] actions = {
                new FindByIdAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                (
                        "Menu." + System.lineSeparator() +
                                "0. Find by id" + System.lineSeparator() +
                                "1. Exit" + System.lineSeparator() +
                                "=== Find Item By Id ====" + System.lineSeparator()+
                                "item" + System.lineSeparator() +
                                "Menu." + System.lineSeparator() +
                                "0. Find by id" + System.lineSeparator() +
                                "1. Exit" + System.lineSeparator()

                )
        ));
    }
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] { "1", "0" }
        );
        Tracker tracker = Tracker.getInstance();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }
}