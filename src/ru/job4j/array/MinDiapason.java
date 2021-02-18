package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        if (finish < array.length - 1) {
            for (int index = start; index <= finish; index++) {
                if (array[index] < min) {
                    min = array[index];
                }
            }
        }
        return min;
    }
}
