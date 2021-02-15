package ru.vitalynec.java.course;

import ru.vitalynec.java.domain.Operable;

public class Pool implements Withstandable {
    private final int distance;

    public Pool(int distance) {
        this.distance = distance;
    }

    @Override
    public void accept(Operable operable) {
        if (operable.isActive()) {
            operable.swim(distance);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Бассейн длиной " + distance + " метров");
    }
}
