package ru.vitalynec.java;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        guessNumber();
        guessWord();
    }

    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это
     * число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное,
     * или меньше. После победы или проигрыша выводится запрос –
     * «Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет).
     */
    public static void guessNumber() {
        int guessedNumber = new Random().nextInt(10);
        System.out.println("Компьютер загадал число. Вам нужно его отгадать за 3 попытки.");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Попытка №" + i);
            int userNumber = getUserInputInt();
            if (guessedNumber == userNumber) {
                System.out.println("Вы угадали число! Победа!");
                break;
            }
        }
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int vote = new Scanner(System.in).nextInt();
        if (vote == 1) {
            guessNumber();
        }
    }

    private static int getUserInputInt() {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.print("Введите число от 0 до 9: ");
            x = scanner.nextInt();
        } while (x < 0 || x > 9);
        return x;
    }

    /**
     * 2. * Создать массив из слов
     * String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
     * "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
     * "pepper", "pineapple", "pumpkin", "potato"}.
     * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным
     * словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы,
     * которые стоят на своих местах.
     * apple – загаданное
     * apricot - ответ игрока
     * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
     * Для сравнения двух слов посимвольно можно пользоваться:
     * String str = "apple";
     * char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
     * Играем до тех пор, пока игрок не отгадает слово.
     * Используем только маленькие буквы.
     */
    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        String guessedWord = words[new Random().nextInt(words.length)];
        System.out.println("Играем в игру \"Угадай слово\"!");
        boolean isContinueGame = true;
        do {
            String userWord = getUserInput();
            char[] printWord = getMaskString().toCharArray();
            for (int i = 0; i < guessedWord.length(); i++) {
                if (i < userWord.length() && guessedWord.charAt(i) == userWord.charAt(i)) {
                    printWord[i] = guessedWord.charAt(i);
                }
            }
            if (guessedWord.equalsIgnoreCase(userWord)) {
                isContinueGame = false;
            } else {
                System.out.println("Вы не угадали!");
                System.out.println("Загаданное слово: " + String.valueOf(printWord));
            }
        } while (isContinueGame);
        System.out.println("Вы угадали загаданное слово!");
    }

    public static final int MASK_COUNT = 15;
    public static final String MASK_CHAR = "#";

    private static String getMaskString() {
        return String.join("", Collections.nCopies(MASK_COUNT, MASK_CHAR));
    }

    private static String getUserInput() {
        System.out.print("Введите ваш вариант слова: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
