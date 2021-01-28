package ru.vitalynec.java;

import java.util.Random;
import java.util.Scanner;

public class Application {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellEmpty(int x, int y) {
        return (isCellValid(x, y) && map[y][x] == DOT_EMPTY);
    }

    public static boolean isCellValid(int x, int y) {
        return (x >= 0 && x < SIZE) && (y >= 0 && y < SIZE);
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symb) {
        return checkDiagonal(symb) || checkDiagonal(symb);
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkDiagonal(char symb) {
        boolean right = true;
        boolean left = true;
        for (int i = 0; i < SIZE; i++) {
            right &= (map[i][i] == symb);
            left &= (map[SIZE - i - 1][i] == symb);
        }
        return right || left;
    }

    public static boolean checkLines(char symb) {
        boolean cols;
        boolean rows;
        for (int i = 0; i < 4; i++) {
            cols = true;
            rows = true;
            for (int j = 0; j < SIZE; j++) {
                cols &= (map[i][j] == symb);
                rows &= (map[j][i] == symb);
            }
            if (cols || rows) return true;
        }
        return false;
    }
}
