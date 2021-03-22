package ru.vitalynec.java.bigtask;

import ru.vitalynec.java.bigtask.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Большая задача:
 * a. Есть классы Fruit -> Apple, Orange; (больше фруктов не надо)
 * b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 */
public class Box<T extends Fruit> {

    /**
     * c. Для хранения фруктов внутри коробки можете использовать ArrayList;
     */
    List<T> fruitBox = new ArrayList<>();

    /**
     * * g. Не забываем про метод добавления фрукта в коробку.
     *
     * @param fruit
     */
    public void putFriut(T fruit) {
        fruitBox.add(fruit);
    }

    /**
     * d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
     * (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
     * <p>
     * P.S. Коробка не должна помнить вес фруктов, поэтому вес помнят сами фрукты
     *
     * @return
     */
    public float getWeight() {
        if (fruitBox.size() > 0) {
            return fruitBox.size() * fruitBox.get(0).getWeight();
        }
        return 0f;
    }

    /**
     * e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут
     * в compare в качестве параметра, true - если их веса равны, false в противном случае (коробки с яблоками мы можем
     * сравнивать с коробками с апельсинами);
     *
     * @param box
     * @return равенство веса Box
     */
    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    /**
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку (помним про сортировку
     * фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается,
     * а в другую перекидываются объекты, которые были в этой коробке;
     *
     * @param tBox
     */
    public void replace(Box<T> tBox) {
        for (T fruit : this.fruitBox) {
            tBox.putFriut(fruit);
        }
        this.fruitBox.clear();
    }
}
