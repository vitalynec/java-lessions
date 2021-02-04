package ru.vitalynec.java.domain;

abstract public class Animal {
    String name;
    int MAX_RUN_RANGE;
    int MAX_SWIM_RANGE;

    private static int animalCount;

    Animal() {
        Animal.animalCount++;
    }

    public void run(int distance) {
        if (distance > MAX_RUN_RANGE) {
            System.out.println(name + " пробежал " + MAX_RUN_RANGE + " метров и устал");
        } else {
            System.out.println(name + " бежит " + distance + " метров");
        }
    }

    public void swim(int distance) {
        if (distance > MAX_RUN_RANGE) {
            System.out.println(name + " проплыл " + MAX_RUN_RANGE + " метров и устал");
        } else {
            System.out.println(name + " плывет " + distance + " метров");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
