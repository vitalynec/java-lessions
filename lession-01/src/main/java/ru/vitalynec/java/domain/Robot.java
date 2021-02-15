package ru.vitalynec.java.domain;

public class Robot implements Operable {
    private final String id;
    private final int maxDistance;
    private final int maxSwimDistance;
    private final int maxHeight;
    private boolean active = true;

    public static int robotCount;

    public Robot(int maxDistance, int maxSwimDistance, int maxHeight) {
        this.maxSwimDistance = maxSwimDistance;
        this.id = String.valueOf(robotCount++);
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void swim(int distance) {
        System.out.println(printInfo() + " не умеет плавать и выбывает");
        setInactive();
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void setInactive() {
        active = false;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    @Override
    public String printInfo() {
        return "Робот с идентификатором " + id;
    }
}
