package ru.vitalynec.java;

public class Application {
    public static void main(String[] args) {

    }

    /**
     * 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
     */
    private static void foo() {
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0f;
        double d = 0d;
        char c = 0;
        boolean boo = true;
    }

    /**
     * 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     * где a, b, c, d – аргументы этого метода, имеющие тип float.
     */
    private static float calculate(float a, float b, float c, float d) {
        return a * (b + c / d);
    }

    /**
     * 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
     * лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean checkInterval(int a, int b) {
        return (a + b) > 10 && (a + b) < 20;
    }

    /**
     * 5. Написать метод, которому в качестве параметра передается целое число, метод должен
     * напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */
    private static void printPositive(int a) {
        String str = "Число " + a + " является: ";
        if (isNegative(a)) {
            System.out.println(str + "отрицательным");
        } else {
            System.out.println(str + "положительным");
        }
    }

    /**
     * 6. Написать метод, которому в качестве параметра передается целое число. Метод должен
     * вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    private static boolean isNegative(int a) {
        return a < 0;
    }

    /**
     * 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
     * Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */
    private static void printHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /**
     * 8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение
     * в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    private static boolean isLeap(int year) {
        if (isNegative(year)) {
            return false;
        }
        if ((year % 4) == 0) {
            return (year % 100) != 0 || (year % 400) == 0;
        }
        return false;
    }
}
