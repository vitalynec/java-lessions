package ru.vitalynec.java;

import ru.vitalynec.java.course.Withstandable;
import ru.vitalynec.java.domain.Operable;
import ru.vitalynec.java.factory.Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
 * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
 * 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
 * соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал,
 * не смог пробежать и т.д.).
 * 3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
 * *4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 * Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */
public class Application {

    public static final int TEAM_SIZE = 15;
    public static final int COURSE_SIZE = 15;

    public static void main(String[] args) {
        List<Operable> team = new ArrayList<>();
        for (int i = 0; i < TEAM_SIZE; i++) {
            team.add(Factory.getOperableAgent());
        }

        List<Withstandable> course = new ArrayList<>();
        for (int i = 0; i < COURSE_SIZE; i++) {
            course.add(Factory.getCourseItem());
        }

        for (Withstandable withstandable : course) {
            withstandable.printInfo();
            for (Operable teammate : team) {
                withstandable.accept(teammate);
            }
            System.out.println();
        }
    }
}
