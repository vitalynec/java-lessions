package ru.vitalynec.java.domain;

public class Cat extends Animal {
    private static int catCount;

    public Cat(String name) {
        super.name = name;
        super.MAX_RUN_RANGE = 200;
        super.MAX_SWIM_RANGE = 0;
        Cat.catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот плавать не умеет");
    }

    public static int getCatCount() {
        return catCount;
    }
}
