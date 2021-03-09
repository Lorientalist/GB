package homework.lesson3;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task {
    public static char player = 'X';
    public static char PC = 'О';
    public static char empty = '_';

    public static char[][] map;
    public static int mapSize = 5;
    public static int deep = 4;

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        /*
        Создать игру в крестики нолики
        Полностью разобраться с кодом, попробовать переписать с нуля;
        ^ Усовершенствовать метод проверки победы (через циклы);
        ^ Расширить поле до 5х5 и в качестве условий победы установить серию равной 4.
         */
        createMap(mapSize);
        printMap();

        while (true) {
            turnPlayer();
            printMap();
            if (checkWinner(player, deep)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            turnPC();
            printMap();
            if (checkWinner(PC, deep)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }

    }

    public static void createMap(int size) {
        mapSize = size;
        map = new char[size][size];
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = empty;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("----------");
    }

    public static void turnPlayer() {
        int a;
        int b;
        System.out.println("Введите координаты вашего хода");
        a = scanner.nextInt() - 1;
        b = scanner.nextInt() - 1;

        boolean validChoice = inBoundCoordinates(a, b) && isEmptyCell(a, b);

        if (validChoice) {
            map[a][b] = player;
        } else {
            System.out.println("Неправильные координаты хода, попробуйте еще раз");
            turnPlayer();
        }

    }

    public static void turnPC() {
        int a;
        int b;
        boolean emptyCell;
        do {
            a = random.nextInt(mapSize);
            b = random.nextInt(mapSize);
            emptyCell = map[a][b] == empty;
        } while (!emptyCell);
        map[a][b] = PC;
    }

    public static boolean checkParity() {
        for (int a = 0; a < mapSize; a++) {
            for (int b = 0; b < mapSize; b++) {
                if (map[a][b] == empty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWinner(char symbol, int deep) {
        for (int a = 0; a < mapSize; a++) {
            for (int b = 0; b < mapSize; b++) {
                if (symbol == map[a][b]) {
                    if (isWinnerToRight(symbol, a, b, deep)) {
                        return true;
                    }
                    if (isWinnerToRightDown(symbol, a, b, deep)) {
                        return true;
                    }
                    if (isWinnerToDown(symbol, a, b, deep)) {
                        return true;
                    }
                    if (isWinnerToLeftDown(symbol, a, b, deep)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isWinnerToRight(char symbol, int a, int b, int deep) {
        for (int i = 0; i < deep; i++) {
            int x = a;
            int y = b + i;
            if (!inBoundCoordinates(x, y)) {
                return false;
            }
            if (map[x][y] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWinnerToRightDown(char symbol, int a, int b, int deep) {
        for (int i = 0; i < deep; i++) {
            int x = a + i;
            int y = b + i;
            if (!inBoundCoordinates(x, y)) {
                return false;
            }
            if (map[x][y] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWinnerToDown(char symbol, int a, int b, int deep) {
        for (int i = 0; i < deep; i++) {
            int x = a + i;
            int y = b;
            if (!inBoundCoordinates(x, y)) {
                return false;
            }
            if (map[x][y] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWinnerToLeftDown(char symbol, int a, int b, int deep) {
        for (int i = 0; i < deep; i++) {
            int x = a - i;
            int y = b + i;
            if (!inBoundCoordinates(x, y)) {
                return false;
            }
            if (map[x][y] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean inBoundCoordinates(int a, int b) {
        return (a >= 0 && a < mapSize) && (b >= 0 && b < mapSize);
    }

    public static boolean isEmptyCell(int a, int b) {
        return map[a][b] == empty;
    }

    public static boolean isMapFull() {
        for (int a = 0; a < mapSize; a++) {
            for (int b = 0; b < mapSize; b++) {
                if (map[a][b] == empty) {
                    return false;
                }
            }
        }
        return true;
    }
}

