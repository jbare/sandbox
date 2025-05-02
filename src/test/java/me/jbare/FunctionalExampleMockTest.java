package me.jbare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunctionalExampleMockTest {

    @Test
    public void testFunctionalExample() {
        final FunctionalExample unit = new FunctionalExample();
        final Data input = new Data("a", "b");
        final int expected = 12;

//        try (MockedStatic<Helper> utilities = Mockito.mockStatic(Helper.class)) {
//            utilities.when(Helper::handle).thenReturn(2);
//
//            final int actual = unit.process(input);
//
//            Assertions.assertEquals(expected, actual);
//        }
    }
}
