package homework.lesson5;

public class Cat extends Animal {
    @Override
    void run(double length) {
        if (length <= 0) {
            System.out.println("Я ЛуЛу. Я пробежал 0 метров!"); //https://i.pinimg.com/originals/3f/a0/f6/3fa0f684ed6d63ef0b4a68c875541d0c.jpg
        } else if (length <= 200) {
            System.out.println("Я ЛуЛу. Я пробежал " + length + " метров!");
        } else {
            System.out.println("Я ЛуЛу. Я пробежал 200 метров!");
        }
    }

    @Override
    void jump(double height) {
        if (height <= 0) {
            System.out.println("Я ЛуЛу. Я прыгнул на 0 метров!");
        } else if (height <= 2) {
            System.out.println("Я ЛуЛу. Я прыгнул на " + height + " метра!");
        } else {
            System.out.println("Я ЛуЛу. Я прыгнул на 2 метра!");
        }
    }
}
