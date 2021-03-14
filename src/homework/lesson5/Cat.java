package homework.lesson5;

public class Cat extends Animal {


    public Cat(double runLimit, double jumpLimit, String name) {
        super(runLimit, -20, jumpLimit, name);
    }

    @Override
    void run(double length) {
        if (length <= 0) {
            System.out.println("Я котик " + name + ". Я пробежал 0 метров!"); //https://i.pinimg.com/originals/3f/a0/f6/3fa0f684ed6d63ef0b4a68c875541d0c.jpg
        } else if (length <= runLimit) {
            System.out.println("Я котик " + name + ". Я пробежал " + length + " метров!");
        } else {
            System.out.println("Я котик " + name + ". Я пробежал " + runLimit + " метров!");
        }
    }

    @Override
    void jump(double height) {
        if (height <= 0) {
            System.out.println("Я котик " + name + ". Я прыгнул на 0 метров!");
        } else if (height <= jumpLimit) {
            System.out.println("Я котик " + name + ". Я прыгнул на " + height + " метра!");
        } else {
            System.out.println("Я котик " + name + ". Я прыгнул на " + jumpLimit + " метра!");
        }
    }
}
