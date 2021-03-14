package homework.lesson5;

public class Animal {
    protected double runLimit;
    protected double swimLimit;
    protected double jumpLimit;
    protected String name;

    public Animal(double runLimit, double swimLimit, double jumpLimit, String name) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        this.name = name;
    }

    void run (double length) {
        System.out.println("Не могу бежать!");
    }
    void swim (double length) {
        System.out.println("Не могу плыть!");
    }
    void jump (double height) {
        System.out.println("Не могу прыгать!");
    }
}
