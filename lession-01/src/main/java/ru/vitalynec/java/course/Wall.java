package ru.vitalynec.java.course;

import ru.vitalynec.java.domain.Operable;

public class Wall implements Withstandable {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void accept(Operable jumpable) {
        if (jumpable.isActive()) {
            jumpable.jump(height);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Стена высотой " + height + " метров");
    }
}
