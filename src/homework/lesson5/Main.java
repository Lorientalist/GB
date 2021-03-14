package homework.lesson5;

public class Main {
    public static void main(String[] args) {
        Animal unknown = new Bird(5, 0.2, "Петушок");
        unknown.jump(-2);
        Dog dog = new Dog(200, 3, 5, "Картошка");
        dog.swim(9);
        Cat cat = new Cat(200, 2, "ЛуЛу");
        cat.run(100);
        cat.swim(100);
    }
}
