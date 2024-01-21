package dev.loops;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.is;

public class MultiplicationTableTest {

    @Test
    public void testGetMultiplicationTableForZero() {
        int num = 0;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testGetMultiplicationTableForOne() {
        int num = 1;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }

    @Test
    public void testGetMultiplicationTableForTwo() {
        int num = 2;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)));
    }

    @Test
    public void testGetMultiplicationTableForThree() {
        int num = 3;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(3, 6, 9, 12, 15, 18, 21, 24, 27, 30)));
    }

    @Test
    public void testGetMultiplicationTableForFour() {
        int num = 4;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(4, 8, 12, 16, 20, 24, 28, 32, 36, 40)));
    }

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

    @Test
    public void testGetMultiplicationTableForSix() {
        int num = 6;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(6, 12, 18, 24, 30, 36, 42, 48, 54, 60)));
    }

    @Test
    public void testGetMultiplicationTableForSeven() {
        int num = 7;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(7, 14, 21, 28, 35, 42, 49, 56, 63, 70)));
    }

    @Test
    public void testGetMultiplicationTableForEight() {
        int num = 8;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(8, 16, 24, 32, 40, 48, 56, 64, 72, 80)));
    }

    @Test
    public void testGetMultiplicationTableForNine() {
        int num = 9;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(9, 18, 27, 36, 45, 54, 63, 72, 81, 90)));
    }

    @Test
    public void testGetMultiplicationTableForTen() {
        int num = 10;

        int[] result = MultiplicationTable.getMultiplicationTable(num);

        Integer[] resultInteger = new Integer[result.length];
        for (int i = 0; i < result.length; i++) {
            resultInteger[i] = result[i];
        }

        assertThat(resultInteger, is(arrayContaining(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)));
    }
}
