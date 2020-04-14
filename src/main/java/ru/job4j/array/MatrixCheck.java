package ru.job4j.array;

/**
 * 6.7.1. Моно строка в матрице.[#257428].
 */
public class MatrixCheck {

    /**
     * Поиск в двухмерном массиве массива,
     * заполненого одинаковыми значениями по горизонтали.
     *
     * @param board массив
     * @param row   ряд
     * @return result
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Поиск в двухмерном массиве массива,
     * заполненого одинаковыми значениями по вертикали.
     *
     * @param board  массив
     * @param column колона
     * @return результат
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проходим по двухмерному массиву и извлекаем его диагональ.
     *
     * @param board массив
     * @return моссив по диагонали.
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Проверяем есть ли в двухмерном массиве, либо горизонталь, либо вертикаль
     * с одинаковыми значениями.
     *
     * @param board
     * @return
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
