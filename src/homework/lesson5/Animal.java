package homework.lesson5;

public class Animal {
    protected static String actionTypeRun = "пробежал(а)";
    protected static String actionTypeSwim = "проплыл(а)";
    protected static String actionTypeJump = "прыгнул(а)";

    protected double runLimit;
    protected double swimLimit;
    protected double jumpLimit;
    protected String name;
    protected String animalType;

    public Animal(double runLimit, double swimLimit, double jumpLimit, String name, String animalType) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        this.name = name;
        this.animalType = animalType;
    }

    public void run(double length) {
        System.out.println("Я " + animalType + " по имени " + name + " не могу бежать!");
    }

    public void swim(double length) {
        System.out.println("Я " + animalType + " по имени " + name + " не могу плыть!");
    }

    public void jump(double height) {
        System.out.println("Я " + animalType + " по имени " + name + " не могу прыгать!");
    }

    protected void runAction(double length) {
        doAction(length, runLimit, actionTypeRun);
    }

    protected void swimAction(double length) {
        doAction(length, swimLimit, actionTypeSwim);
    }

    protected void jumpAction(double height) {
        doAction(height, jumpLimit, actionTypeJump);
    }

    protected void doAction(double targetActionParam, double actionLimit, String actionType) {
        if (targetActionParam <= 0) {
            System.out.println("Я " + animalType + ", меня зовут " + name + ". Я " + actionType + " 0 метров!");
        } else if (targetActionParam <= actionLimit) {
            System.out.println("Я " + animalType + ", меня зовут " + name + ". Я " + actionType + " " + targetActionParam + " метров!");
        } else {
            System.out.println("Я " + animalType + ", меня зовут " + name + ". Я " + actionType + " " + actionLimit + " метров!");
        }
    }
}
