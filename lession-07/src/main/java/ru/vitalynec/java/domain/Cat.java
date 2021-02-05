package ru.vitalynec.java.domain;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean hungry = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eat(Plate p) {
        if (isHungry()) {
            if (p.decreaseFood(appetite)) {
                hungry = false;
                System.out.println(name + " скушал " + appetite + " еды");
            }
        } else {
            printCarInfo();
        }
    }

    public void printCarInfo() {
        System.out.println(name + (isHungry() ? " " : " не ") + "голоден");
    }
}
