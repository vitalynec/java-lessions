package ru.vitalynec.java;

import ru.vitalynec.java.exception.MyArrayDataException;
import ru.vitalynec.java.exception.MyArraySizeException;

/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого
 * размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то
 * элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
 * брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
 * MyArrayDataException, и вывести результат расчета.
 */
public class Application {
    public static final int MATRIX_SIZE = 4;

    public static void main(String[] args) {
        String[][] str = {
                {"12", "13", "1324", "234"},
                {"12", "13", "1324", "234"},
                {"12", "13", "1324", "234"},
                {"12", "13", "1324", "234"}
        };
        try {
            System.out.println(getMatrixSum(str));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long getMatrixSum(String[][] mtx) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < mtx.length; i++) {
            if (mtx.length != MATRIX_SIZE | mtx[i].length != MATRIX_SIZE) {
                throw new MyArraySizeException();
            }
        }
        long result = 0;

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                try {
                    result += Integer.parseInt(mtx[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                }
            }
        }
        return result;
    }
}
