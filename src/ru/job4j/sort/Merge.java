package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) throws Exception {
        Merge merge = new Merge();
        int[] result = merge.merge(
                new int[]{9, 31, 32, 35, 100, 233, 1233},
                new int[]{5, 5, 12, 4000}
        );
        System.out.println(Arrays.toString(result));
    }

    public int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        if (left.length == 0) {
            result = right;
        } else if (right.length == 0) {
            result = left;
        }

        int countL = 0;
        int countR = 0;
        int countOfResult = 0;

        while (countOfResult < result.length) {

            if (countL < left.length && countR < right.length) {
                result[countOfResult] = Math.min(left[countL], right[countR]);

                if (result[countOfResult] == left[countL] && result[countOfResult] == right[countR]) {
                    result[countOfResult + 1] = left[countL];
                    countL++;
                    countR++;
                    countOfResult++;
                } else if (result[countOfResult] == left[countL]) {
                    countL++;
                } else if (result[countOfResult] == right[countR]) {
                    countR++;
                }
                countOfResult++;

            } else if (countL == left.length && countR < right.length) {
                result[countOfResult] = right[countR];
                countR++;
                countOfResult++;

            } else if (countR == right.length && countL < left.length) {
                result[countOfResult] = left[countL];
                countL++;
                countOfResult++;
            }
        }
        return result;
    }
}
