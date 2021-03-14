package homework.lesson5;

public class Dog extends Animal {
    @Override
    void run(double length) {
        if (length <= 0) {
            System.out.println("Я коржик. Я пробежал 0 метров!"); //https://cs9.pikabu.ru/post_img/big/2017/06/14/7/1497437142125774507.jpg
        } else if (length <= 500) {
            System.out.println("Я коржик. Я пробежал " + length + " метров!");
        } else {
            System.out.println("Я коржик. Я пробежал 500 метров!");
        }
    }

    @Override
    void swim(double length) {
        if (length <= 0) {
            System.out.println("Я коржик. Я проплыл 0 метров!");
        } else if (length <= 10) {
            System.out.println("Я коржик. Я проплыл " + length + " метров!");
        } else {
            System.out.println("Я коржик. Я проплыл 10 метров!");
        }
    }

    @Override
    void jump(double height) {
        if (height <= 0) {
            System.out.println("Я коржик. Я прыгнул на 0 метров!");
        } else if (height <= 0.5) {
            System.out.println("Я коржик. Я прыгнул на " + height + " метров!");
        } else {
            System.out.println("Я коржик. Я прыгнул на 0.5 метров!");
        }
    }
}
