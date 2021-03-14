package homework.lesson5;

public class Cat extends Animal {
    public Cat(double runLimit, double jumpLimit, String name) {
        super(runLimit, -20, jumpLimit, name, "Котик");
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
