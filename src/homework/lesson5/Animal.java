package homework.lesson5;

public abstract class Animal {
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

    abstract void run(double length);
    abstract void swim(double length);
    abstract void jump(double height);

    protected void cantRun() {
        System.out.println("Я " + animalType + " по имени " + name + " не могу бежать!");
    }

    protected void cantSwim() {
        System.out.println("Я " + animalType + " по имени " + name + " не могу плыть!");
    }

    protected void cantJump() {
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
