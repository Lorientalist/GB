package homework.lesson5;

public class Bird extends Animal {


    public Bird(double runLimit, double jumpLimit, String name) {
        super(runLimit, -1, jumpLimit, name);
    }

    @Override
    void run(double length) {
        if (length <= 0) {
            System.out.println("Я птичка. Я пробежала 0 метров!");
        } else if (length <= runLimit) {
            System.out.println("Я птичка. Я пробежала " + length + " метров!");
        } else {
            System.out.println("Я птичка. Я пробежала " + runLimit + " метров!");
        }
    }


    @Override
    void jump(double height) {
        if (height <= 0) {
            System.out.println("Я птичка. Я прыгнула на 0 метров!");
        } else if (height <= jumpLimit) {
            System.out.println("Я птичка. Я прыгнула на " + height + " метров!");
        } else {
            System.out.println("Я птичка. Я прыгнула на " + jumpLimit + " метров!");
        }
    }
}
