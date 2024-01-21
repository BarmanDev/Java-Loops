package dev.loops;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.is;

public class MultiplicationTableTest {
//
    @Test
    public void testGetMultiplicationTableForFive() {
        int num = 5;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(5, 10, 15, 20, 25, 30, 35, 40, 45, 50)));
    }
}
