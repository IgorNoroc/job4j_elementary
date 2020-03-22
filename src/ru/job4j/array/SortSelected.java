package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoop.indexOf(data, min, 0, data.length);

        for (int i = 0; i < data.length - 1; i++) {
            if (data[index] < data[i]) {
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
            min = MinDiapason.findMin(data, ++i, data.length);
            index = FindLoop.indexOf(data, min, i, data.length);
            i--;
        }
        return data;
    }
}
