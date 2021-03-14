package homework.lesson5;

public class Dog extends Animal {


    public Dog(double runLimit, double swimLimit, double jumpLimit, String name) {
        super(runLimit, swimLimit, jumpLimit, name);
    }

    @Override
    void run(double length) {
        if (length <= 0) {
            System.out.println("Я пёсик " + name + ". Я пробежал 0 метров!"); //https://cs9.pikabu.ru/post_img/big/2017/06/14/7/1497437142125774507.jpg
        } else if (length <= runLimit) {
            System.out.println("Я пёсик " + name + ". Я пробежал " + length + " метров!");
        } else {
            System.out.println("Я пёсик " + name + ". Я пробежал " + runLimit + " метров!");
        }
    }

    @Override
    void swim(double length) {
        if (length <= 0) {
            System.out.println("Я пёсик" + name + ". Я проплыл 0 метров!");
        } else if (length <= swimLimit) {
            System.out.println("Я пёсик " + name + ". Я проплыл " + length + " метров!");
        } else {
            System.out.println("Я пёсик " + name + ". Я проплыл " + swimLimit + " метров!");
        }
    }

    @Override
    void jump(double height) {
        if (height <= 0) {
            System.out.println("Я пёсик " + name + ". Я прыгнул на 0 метров!");
        } else if (height <= jumpLimit) {
            System.out.println("Я пёсик " + name + ". Я прыгнул на " + height + " метров!");
        } else {
            System.out.println("Я пёсик " + name + ". Я прыгнул на " + jumpLimit + " метров!");
        }
    }

}
