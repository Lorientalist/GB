package homework.lesson1;

/**
 * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
 * где a, b, c, d – целочисленные входные параметры этого метода
 */
public class Task1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 67;
        int c = 9;
        int d = 145;
        float result;
        double result1;

        result = a * (b + (c / d));
        result1 = a * (b + (c / d));
        System.out.println(result);
        System.out.println(result1);

    }


}
