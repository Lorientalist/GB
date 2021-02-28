package homework.lesson1;

/**
 * Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
 * от 10 до 20(включительно), если да – вернуть true, в противном случае – false
 */

public class Task2 {
    public static void main(String[] args) {

        boolean result = checkSum(10, 2);
        System.out.println(result);

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
}
