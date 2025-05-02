package me.jbare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunctionalExampleTest {

    @Test
    public void testFunctionalExample() {
        final FunctionalExample unit = new FunctionalExample();
        final Data input = new Data("a", "b");
        final int expected = 12;

        final int actual = unit.process(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFunctionalExample1() {
        final FunctionalExample unit = new FunctionalExample();
        final Data input = new Data("a", "c");
        final int expected = 24;

        final int actual = unit.process(input);

        Assertions.assertEquals(expected, actual);
    }
}
