package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactTest{
    @Test(expected = IllegalArgumentException.class)
    public void testFact() {
        int rsl = Fact.calc(-1);
        assertThat(rsl, is(24));
    }
}