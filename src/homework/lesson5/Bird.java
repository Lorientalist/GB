package homework.lesson5;

public class Bird extends Animal {
    public Bird(double runLimit, double jumpLimit, String name) {
        super(runLimit, -1, jumpLimit, name, "Птичка");
    }

    @Override
    public void run(double length) {
        runAction(length);
    }

    @Override
    public void jump(double height) {
        jumpAction(height);
    }
}
