package homework.lesson5;

public class Horse extends Animal {
    @Override
    void run(double length) {
        if (length <= 0) {
            System.out.println("Я конек-горбунок. Я пробежал 0 метров!");
        } else if (length <= 1500) {
            System.out.println("Я конек-горбунок. Я пробежал " + length + " метров!");
        } else {
            System.out.println("Я конек-горбунок. Я пробежал 1500 метров!");
        }
    }

    @Override
    void swim(double length) {
        if (length <= 0) {
            System.out.println("Я конек-горбунок. Я проплыл 0 метров!");
        } else if (length <= 100) {
            System.out.println("Я конек-горбунок. Я проплыл " + length + " метров!");
        } else {
            System.out.println("Я конек-горбунок. Я проплыл 100 метров!");
        }
    }

    @Override
    void jump(double height) {
        if (height <= 0) {
            System.out.println("Я конек-горбунок. Я прыгнул на 0 метров!");
        } else if (height <= 3) {
            System.out.println("Я конек-горбунок. Я прыгнул на " + height + " метра!");
        } else {
            System.out.println("Я конек-горбунок. Я прыгнул на 3 метра!");
        }
    }
}
