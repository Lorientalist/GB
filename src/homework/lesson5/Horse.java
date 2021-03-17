package homework.lesson5;

public class Horse extends Animal {
    public Horse(double runLimit, double swimLimit, double jumpLimit, String name) {
        super(runLimit, swimLimit, jumpLimit, name, "Коняжка");
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
