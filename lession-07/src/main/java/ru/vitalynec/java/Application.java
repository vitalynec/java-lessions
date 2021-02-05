package ru.vitalynec.java;

import ru.vitalynec.java.domain.Cat;
import ru.vitalynec.java.domain.Plate;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Cat> animals = new ArrayList<>();
        animals.add(new Cat("Мурзик", 5));
        animals.add(new Cat("Кошка", 3));
        animals.add(new Cat("Дымок", 6));
        animals.add(new Cat("Снежок", 5));

        Plate plate = new Plate(25);
        plate.info();

        for (int i = 0; i < 2; i++) {
            for (Cat cat : animals) {
                cat.eat(plate);
            }
        }
        plate.info();

        plate.increaseFood(10);
        plate.info();
    }
}
