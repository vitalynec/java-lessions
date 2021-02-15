package ru.vitalynec.java.course;

import ru.vitalynec.java.domain.Operable;

public class Treadmill implements Withstandable {
    private final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void accept(Operable runnable) {
        if (runnable.isActive()) {
            runnable.run(distance);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Беговая дорожка на " + distance + " метров");
    }
}
