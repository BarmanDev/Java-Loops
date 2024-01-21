package dev.loops;

public class MultiplicationTable {

    public static int[] getMultiplicationTable(int num) {
        int[] result = new int[10];

        for (int i = 0; i < 10; i++) {
            result[i] = num * (i + 1);
        }

        return result;
    }

}
