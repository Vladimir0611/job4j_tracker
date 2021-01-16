package ru.job4j.tracker;

import org.junit.Test;
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
        Tracker tracker = new Tracker();
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
            Tracker tracker = new Tracker();

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
                new String[] {"0", "name", "1"}
        );
        Tracker tracker = new Tracker();
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
                                "Заявки с таким именем не найдены" + System.lineSeparator() +
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
        Tracker tracker = new Tracker();
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
                                "Заявка с таким id не найдена" + System.lineSeparator() +
                                "Menu." + System.lineSeparator() +
                                "0. Find by id" + System.lineSeparator() +
                                "1. Exit" + System.lineSeparator()

                )
        ));
    }
}