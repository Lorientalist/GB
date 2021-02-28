package homework.lesson1;

import java.sql.SQLOutput;

/**
 * Написать метод, которому в качестве параметра передается целое число, метод должен проверить
 * положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
 * Результат работы метода вывести в консоль
 */

public class Task3 {
    public static void main(String[] args) {

        int a = 125;
        checkNum(a);

    }

    public static void checkNum(int a) {

        if (a >= 0) {
            System.out.println("Число положительное!");
        } else
            System.out.println("Число отрицательное!");
    }

}
