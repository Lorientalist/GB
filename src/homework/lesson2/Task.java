package homework.lesson2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task {
    public static void main(String[] args) {
        /*
        Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0
         */
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replaceArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println("----------");
        /*
        Задать пустой целочисленный массив размером 8.
        Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
         */
        int[] array1 = new int[8];
        fillArray(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("----------");
        /*
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2
         */
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multipleArrayLowerThanSix(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println("----------");
        /*
        Задать одномерный массив.
        Написать методы поиска в нём минимального и максимального элемента
         */
        int[] array3 = {1, 5, 3, 2, 11, 4, -5, 29, 4, 8, 9, 1541};
        System.out.println(Arrays.toString(array3));
        findMinAndMaxElement(array3);
        System.out.println();
        System.out.println("----------");
        /*
        Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
        заполнить его диагональные элементы единицами, используя цикл(ы);
         */
        fillDiagonalsArray(5);

    }

    public static void replaceArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 1) {
                inputArray[i] = 0;
            } else if (inputArray[i] == 0) {
                inputArray[i] = 1;
            }
        }
    }

    public static void fillArray(int[] array) {
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 3;
        }

    }

    public static void multipleArrayLowerThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void findMinAndMaxElement(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print(max + "; " + min);
    }

    public static void fillDiagonalsArray(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
            array[i][n-i-1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

}
