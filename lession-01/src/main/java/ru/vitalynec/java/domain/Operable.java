package ru.vitalynec.java.domain;

public interface Operable {
    default void checkSuccess(boolean flag) {
        if (flag) {
            System.out.println(printInfo() + " справляется с заданием");
        } else {
            System.out.println(printInfo() + " выбывает с дистанции");
            this.setInactive();
        }
    }

    default void run(int distance) {
        checkSuccess(distance <= getMaxDistance());
    }

    default void jump(int height) {
        checkSuccess(height <= getMaxHeight());
    }

    default void swim(int distance) {
        checkSuccess(distance <= getMaxSwimDistance());
    }

    boolean isActive();

    void setInactive();

    int getMaxHeight();

    int getMaxDistance();

    int getMaxSwimDistance();

    String printInfo();
}
