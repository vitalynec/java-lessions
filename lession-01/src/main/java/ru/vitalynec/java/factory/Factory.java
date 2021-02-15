package ru.vitalynec.java.factory;

import ru.vitalynec.java.course.Pool;
import ru.vitalynec.java.course.Treadmill;
import ru.vitalynec.java.course.Wall;
import ru.vitalynec.java.course.Withstandable;
import ru.vitalynec.java.domain.Cat;
import ru.vitalynec.java.domain.Human;
import ru.vitalynec.java.domain.Operable;
import ru.vitalynec.java.domain.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Фабрика для генерации случайных участников и элементов полосы препядствий
 */
public class Factory {
    private static final int HUMAN_MAX_DISTANCE = 1500;
    private static final int HUMAN_MAX_SWIM_DISTANCE = 150;
    private static final int HUMAN_MAX_HEIGHT = 3;
    private static final int CAT_MAX_DISTANCE = 50;
    private static final int CAT_MAX_SWIM_DISTANCE = 15;
    private static final int CAT_MAX_HEIGHT = 5;
    private static final int ROBOT_MAX_DISTANCE = 5000;
    private static final int ROBOT_MAX_SWIM_DISTANCE = 0;
    private static final int ROBOT_MAX_HEIGHT = 1;

    private static final int TREADMILL_MAX_DISTANCE = 150;
    private static final int WALL_MAX_HEIGHT = 3;
    private static final int POOL_MAX_DISTANCE = 5;

    private static final int COUNT_TYPE_AGENT = 3;
    private static final int COUNT_TYPE_COURSE = 3;

    public static Withstandable getCourseItem() {
        Random random = new Random();
        switch (random.nextInt(COUNT_TYPE_COURSE)) {
            case 0: {
                return new Wall(random.nextInt(WALL_MAX_HEIGHT));
            }
            case 1: {
                return new Treadmill(random.nextInt(TREADMILL_MAX_DISTANCE));
            }
            case 2: {
                return new Pool(random.nextInt(POOL_MAX_DISTANCE));
            }
            default: {
                return getCourseItem();
            }
        }
    }

    public static Operable getOperableAgent() {
        Random random = new Random();
        switch (random.nextInt(COUNT_TYPE_AGENT)) {
            case 0: {
                return new Human(
                        getRandomHumanName(),
                        random.nextInt(HUMAN_MAX_DISTANCE),
                        random.nextInt(HUMAN_MAX_SWIM_DISTANCE),
                        random.nextInt(HUMAN_MAX_HEIGHT)
                );
            }
            case 1: {
                return new Cat(
                        getRandomCatName(),
                        random.nextInt(CAT_MAX_DISTANCE),
                        random.nextInt(CAT_MAX_SWIM_DISTANCE),
                        random.nextInt(CAT_MAX_HEIGHT)
                );
            }
            case 2: {
                return new Robot(
                        random.nextInt(ROBOT_MAX_DISTANCE),
                        ROBOT_MAX_SWIM_DISTANCE,
                        random.nextInt(ROBOT_MAX_HEIGHT)
                );
            }
            default: {
                return getOperableAgent();
            }
        }
    }

    private static String getRandomHumanName() {
        List<String> names = new ArrayList<>();
        names.add("Василий");
        names.add("Андрей");
        names.add("Михаил");
        names.add("Николай");
        names.add("Александр");
        names.add("Виктор");
        names.add("Анатолий");
        names.add("Вячеслав");
        names.add("Олег");
        names.add("Никита");
        names.add("Федор");
        names.add("Игорь");
        names.add("Владимир");
        return names.get(new Random().nextInt(names.size()));
    }

    private static String getRandomCatName() {
        List<String> names = new ArrayList<>();
        names.add("Барсик");
        names.add("Мурзик");
        names.add("Диван");
        names.add("Снежок");
        names.add("Эйтыкот");
        names.add("Виктор");
        names.add("Кот");
        names.add("Дымок");
        return names.get(new Random().nextInt(names.size()));
    }
}
