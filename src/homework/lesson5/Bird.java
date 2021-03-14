package homework.lesson5;

public class Bird extends Animal {
    @Override
    void run(double length) {
        if (length <= 0) {
            System.out.println("Я птичка. Я пробежала 0 метров!");
        } else if (length <= 5) {
            System.out.println("Я птичка. Я пробежала " + length + " метров!");
        } else {
            System.out.println("Я птичка. Я пробежала 5 метров!");
        }
    }


    @Override
    void jump(double height) {
        if (height <= 0) {
            System.out.println("Я птичка. Я прыгнула на 0 метров!");
        } else if (height <= 0.2) {
            System.out.println("Я птичка. Я прыгнула на " + height + " метров!");
        } else {
            System.out.println("Я птичка. Я прыгнула на 0.2 метров!");
        }
    }
}
