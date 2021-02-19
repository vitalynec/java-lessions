package ru.vitalynec.java.exception;

public class MyArraySizeException extends MyArrayException {

    private static final String DEFAULT_MSG = "Некорректный размер массива";

    public MyArraySizeException(String m) {
        super(m);
    }

    public MyArraySizeException() {
        super(DEFAULT_MSG);
    }
}
