package homework.lesson5;

public class Dog extends Animal {
    public Dog(double runLimit, double swimLimit, double jumpLimit, String name) {
        super(runLimit, swimLimit, jumpLimit, name, "Пёсик");
    }

    @Override
    public void run(double length) {
        runAction(length);
    }

    @Override
    public void swim(double length) {
        swimAction(length);
    }

    @Override
    public void jump(double height) {
        jumpAction(height);
    }
}
