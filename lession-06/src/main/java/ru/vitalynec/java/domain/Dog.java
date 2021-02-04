package ru.vitalynec.java.domain;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name) {
        super.name = name;
        super.MAX_RUN_RANGE = 500;
        super.MAX_SWIM_RANGE = 10;
        Dog.dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
