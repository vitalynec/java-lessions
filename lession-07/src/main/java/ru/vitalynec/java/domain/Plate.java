package ru.vitalynec.java.domain;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void increaseFood(int n) {
        food += n;
    }

    public boolean decreaseFood(int n) {
        if (n > food) {
            System.out.println("В тарелке не хватит еды");
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void info() {
        System.out.println("В тарелке осталось еды: " + food);
    }
}
