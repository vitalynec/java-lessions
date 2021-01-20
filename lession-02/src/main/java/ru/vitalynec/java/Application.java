package ru.vitalynec.java;

public class Application {

    public static void main(String[] args) {
        invertArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        initAndFillThrees(8);
        multiplyLessSix(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        minAndMax(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1});
        shiftArray(new int[]{1, 2, 3, 4, 5}, -2);
    }

    /**
     * 1.Задать целочисленный массив, состоящий из элементов 0и 1. Например:[1,1,0,0,1,0,1,1,0,0].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0.
     */
    private static void invertArray(int[] sourceArray) {
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] == 0) {
                targetArray[i] = 1;
            } else if (sourceArray[i] == 1) {
                targetArray[i] = 0;
            }
        }
    }

    /**
     * 2.Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.
     */
    private static void initAndFillThrees(int arrayLenght) {
        int[] array = new int[arrayLenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
    }

    /**
     * 3.Задать массив [1,5,3,2,11,4,5,2,4,8,9,1] пройти по нему циклом и числа меньшие 6 умножить на 2.
     */
    private static void multiplyLessSix(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] < 6) {
                sourceArray[i] *= 2;
            }
        }
    }

    /**
     * 4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
     */
    private static void fillMartixDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = 0;
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    /**
     * 5.**Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета).
     */
    private static void minAndMax(int[] sourceArray) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            if (min > sourceArray[i]) {
                min = sourceArray[i];
            }
            if (max < sourceArray[i]) {
                max = sourceArray[i];
            }
        }
    }

    /**
     * 6.**Написать метод, в который передается непустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры: checkBalance([2,2,2,1,2,2,||10,1]) → true, checkBalance([1,1,1,||2,1]) → true,
     * граница показана символами||, эти символы в массив не входят.
     */
    private static boolean checkBalance(int[] sourceArray) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            leftSum += sourceArray[i];
            for (int j = i + 1; j < sourceArray.length; j++) {
                rightSum += sourceArray[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
            rightSum = 0;
        }
        return false;
    }

    /**
     * 7.****Написать метод, которому на вход подается одномерный массив и число n (может быть положительным
     * или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются
     * циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     * Примеры: [1,2,3] при n=1 (на один вправо)->[3,1,2]; [3,5,6,1] при n=-2 (на два влево)->[6,1,3,5].
     * При каком n в какую сторону сдвиг можете выбирать сами.
     */
    private static void shiftArray(int[] sourceArray, int shift) {
        int currertPosition = 0;
        int currentValue = 0;
        int previousValue;
        for (int i = 0; i < sourceArray.length; i++) {
            int newPosition = getNextPosition(currertPosition, shift, sourceArray.length);
            previousValue = sourceArray[newPosition];
            if (i == 0) {
                currentValue = sourceArray[currertPosition];
            }
            sourceArray[newPosition] = currentValue;
            currertPosition = newPosition;
            currentValue = previousValue;
        }
    }

    private static int getNextPosition(int currentPosition, int shift, int length) {
        int newPosition = currentPosition + shift;;
        if (shift > 0) {
            if (newPosition >= length) {
                newPosition = (newPosition - length);
            }
        } else {
            if (newPosition < 0) {
                newPosition = (newPosition + length);
            }
        }
        return newPosition;
    }
}
