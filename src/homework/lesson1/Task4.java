package homework.lesson1;

/**
 * Написать метод, которому в качестве параметра передается строка, обозначающая имя,
 * метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль
 */
public class Task4 {
    public static void main(String[] args) {
        String name = "Nina";
        System.out.println(helloName(name));
    }

    public static String helloName(String name) {
        String greetingsMessage = "Привет, " + name + "!";
        return greetingsMessage;
    }
}
