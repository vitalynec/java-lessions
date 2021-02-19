package ru.vitalynec.java.exception;

public class MyArrayDataException extends MyArrayException {
    public static final String DEFAULT_MSG = "Некорректный элемент массива: ";

    public MyArrayDataException(String item) {
        super(DEFAULT_MSG + item);
    }
}
