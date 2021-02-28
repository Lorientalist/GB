package homework.lesson1;

public class Task {
    public static void main(String[] args) {
        /*
         * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
         * где a, b, c, d – целочисленные входные параметры этого метода
         */
        System.out.println(calcF(10, 67, 4, 145));
        System.out.println(calcD(1964, 3, 99, 926));
        /*
         * Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
         * от 10 до 20(включительно), если да – вернуть true, в противном случае – false
         */
        boolean result = checkSum(10, 2);
        System.out.println(result);
        /*
         * Написать метод, которому в качестве параметра передается целое число, метод должен проверить
         * положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
         * Результат работы метода вывести в консоль
         */
        int a = 125;
        checkNum(a);
        /*
         * Написать метод, которому в качестве параметра передается строка, обозначающая имя,
         * метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль
         */
        String name = "Nina";
        System.out.println(helloName(name));
    }

    public static float calcF(int a, int b, int c, int d) {
        float result = a * (b + (c / d));
        return result;
    }

    public static double calcD(int a, int b, int c, int d) {
        double result = a * (b + (c / d));
        return result;
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum < 10) {
            return false;
        } else if (sum > 20) {
            return false;
        } else {
            return true;
        }
    }

    public static void checkNum(int a) {

        if (a >= 0) {
            System.out.println("Число положительное!");
        } else
            System.out.println("Число отрицательное!");
    }

    public static String helloName(String name) {
        String greetingsMessage = "Привет, " + name + "!";
        return greetingsMessage;
    }

}
