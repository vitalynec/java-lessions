package ru.vitalynec.java;

import ru.vitalynec.java.domain.Animal;
import ru.vitalynec.java.domain.Cat;
import ru.vitalynec.java.domain.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Бобик"));
        animals.add(new Cat("Мурзик"));
        animals.add(new Dog("Тузик"));
        animals.add(new Cat("Кошка"));
        animals.add(new Dog("Барбос"));
        animals.add(new Cat("Дымок"));
        animals.add(new Cat("Снежок"));

        Random random = new Random();
        for (Animal animal : animals) {
            if (random.nextInt(2) == 1) {
                animal.run(random.nextInt(1000));
            } else {
                animal.swim(random.nextInt(50));
            }
        }
        System.out.println("Создано собак: " + Dog.getDogCount());
        System.out.println("Создано кошек: " + Cat.getCatCount());
        System.out.println("Всего создано животных: " + Animal.getAnimalCount());
    }
}
