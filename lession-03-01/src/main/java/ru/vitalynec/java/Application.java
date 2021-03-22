package ru.vitalynec.java;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

    }

    /**
     * 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
     */
    public static void swap(Object[] array, int sourceIndex, int targetIndex) {
        Object temp = array[sourceIndex];
        array[sourceIndex] = array[targetIndex];
        array[targetIndex] = temp;
    }

    /**
     * 2. Написать метод, который преобразует массив в ArrayList;
     */
    public static <T> List<T> toArrayList(T[] array) {
        List<T> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}
