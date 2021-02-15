package ru.vitalynec.java.domain;

public class Cat implements Operable {
    private final String name;
    private final int maxDistance;
    private final int maxSwimDistance;
    private final int maxHeight;
    private boolean active = true;

    public Cat(String name, int maxDistance, int maxSwimDistance, int maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxHeight = maxHeight;
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
        return "Кот по кличке " + name;
    }
}
